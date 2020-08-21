package at.frebort.billing.backend.service;

import at.frebort.billing.backend.dao.CustomerRepository;
import at.frebort.billing.backend.dto.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class CustomerService.
 */
@Service
public class CustomerService {

   /** The provider. */
   private final CustomerRepository repository;

   @Autowired
   public CustomerService(final CustomerRepository repository) {
      this.repository = repository;
   }

   /**
    * Gets the customers.
    *
    * @return the customers
    */
   public List<Customer> getCustomers() {
      return this.repository.findAll();
   }

   /**
    * Insert customers.
    */
   public void insertCustomers(final List<Customer> customers) {
      this.repository.saveAll(customers);
   }

   /**
    * Gets the next customer id.
    *
    * @return the next customer id
    */
   public Integer getNextCustomerId() {
      final Integer maxCustomerId = this.repository.findMaxCustomerId();
      return maxCustomerId + 1;
   }
}
