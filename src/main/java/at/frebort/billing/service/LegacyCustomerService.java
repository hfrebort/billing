package at.frebort.billing.service;

import at.frebort.billing.dao.CustomerRepository;
import at.frebort.billing.dao.LegacyDao;
import at.frebort.billing.dto.Customer;
import at.frebort.billing.mapper.CustomerMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class LegacyCustomerService.
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
