/*******************************************************************************
 ** COPYRIGHT: CNS-Solutions & Support GmbH
 **            Member of Frequentis Group
 **            Innovationsstrasse 1
 **            A-1100 Vienna
 **            AUSTRIA
 **            Tel. +43 1 81150-0
 ** LANGUAGE:  Java, J2SE JDK
 **
 ** The copyright to the computer program(s) herein is the property of
 ** CNS-Solutions & Support GmbH, Austria. The program(s) shall not be used
 ** and/or copied without the written permission of CNS-Solutions & Support GmbH.
 *******************************************************************************/
package at.frebort.billing.backend.service;

import at.frebort.billing.backend.dao.CustomerRepository;
import at.frebort.billing.backend.dao.LegacyDao;
import at.frebort.billing.backend.dao.ZipCodeRepository;
import at.frebort.billing.backend.dto.Customer;
import at.frebort.billing.backend.dto.ZipCodeData;
import at.frebort.billing.backend.mapper.CustomerMapper;
import at.frebort.billing.backend.mapper.ZipCodeMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class LegacyCustomerService.
 *
 * @author hfrebort
 * @version 16.08.2020
 */
@Service
public class LegacyCustomerService {

   /** The customer repository. */
   private final CustomerRepository customerRepository;

   /** The zip code repository. */
   private final ZipCodeRepository zipCodeRepository;

   /** The customer mapper. */
   private final CustomerMapper customerMapper;

   /** The zip code mapper. */
   private final ZipCodeMapper zipCodeMapper;

   /**
    * Instantiates a new legacy customer service.
    *
    * @param customerRepository the customer repository
    * @param zipCodeRepository the zip code repository
    */
   @Autowired
   public LegacyCustomerService(final CustomerRepository customerRepository, final CustomerMapper customerMapper,
         final ZipCodeRepository zipCodeRepository, final ZipCodeMapper zipCodeMapper) {
      this.customerRepository = customerRepository;
      this.customerMapper = customerMapper;
      this.zipCodeRepository = zipCodeRepository;
      this.zipCodeMapper = zipCodeMapper;
   }

   /**
    * Migrate.
    *
    * @return the list
    */
   public List<String> migrate() {

      final List<String> statistics = new ArrayList<>();
      statistics.add("Migrated Customers: " + this.migrateCustomers().size());
      statistics.add("Migrated ZipCodes: " + this.migrateZipCodes().size());

      return statistics;
   }

   private List<Customer> migrateCustomers() {
      final List<Customer> customers = new LegacyDao<>(this.customerMapper).loadEntity("kunden");
      return this.customerRepository.saveAll(customers);
   }

   private List<ZipCodeData> migrateZipCodes() {
      final LegacyDao<ZipCodeData> legacyDao = new LegacyDao<>(this.zipCodeMapper);
      final List<ZipCodeData> zipCodes = legacyDao.executeQuery("select distinct Postleitzahl, Ort from Kunden");
      return this.zipCodeRepository.saveAll(zipCodes);
   }
}
