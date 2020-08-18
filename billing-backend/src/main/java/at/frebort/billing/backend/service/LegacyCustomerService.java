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
import at.frebort.billing.backend.mapper.CustomerMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO: Auto-generated Javadoc
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

   /**
    * Instantiates a new legacy customer service.
    *
    * @param customerRepository the customer repository
    * @param zipCodeRepository the zip code repository
    */
   @Autowired
   public LegacyCustomerService(final CustomerRepository customerRepository, final ZipCodeRepository zipCodeRepository) {
      this.customerRepository = customerRepository;
      this.zipCodeRepository = zipCodeRepository;
   }

   /**
    * Migrate.
    *
    * @return the list
    */
   public List<String> migrate() {

      final CustomerMapper customerMapper = new CustomerMapper();
      final LegacyDao<Customer> customerDao = new LegacyDao<>(customerMapper);
      final List<Customer> customers = customerDao.load("kunden");

      this.customerRepository.saveAll(customers);

      final List<String> statistics = new ArrayList<>();
      statistics.add("Migrated Customers: " + customers.size());
      return statistics;
   }
}
