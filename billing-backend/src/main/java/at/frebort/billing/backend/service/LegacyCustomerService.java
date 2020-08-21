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
import at.frebort.billing.backend.dto.Customer;
import at.frebort.billing.backend.mapper.CustomerMapper;

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

   /** The customer mapper. */
   private final CustomerMapper customerMapper;

   /**
    * Instantiates a new legacy customer service.
    *
    * @param customerRepository the customer repository
    * @param customerMapper the customer mapper
    */
   @Autowired
   public LegacyCustomerService(final CustomerRepository customerRepository, final CustomerMapper customerMapper) {
      this.customerRepository = customerRepository;
      this.customerMapper = customerMapper;
   }

   /**
    * Migrate.
    *
    * @return the list
    */
   public List<String> migrate() {
      final List<String> statistics = new ArrayList<>();
      statistics.add("Migrated Customers: " + this.migrateCustomers().size());
      return statistics;
   }

   /**
    * Migrate customers.
    *
    * @return the list
    */
   private List<Customer> migrateCustomers() {
      final List<Customer> customers = new LegacyDao<>(this.customerMapper).loadEntity("kunden");
      return this.customerRepository.saveAll(customers);
   }

}
