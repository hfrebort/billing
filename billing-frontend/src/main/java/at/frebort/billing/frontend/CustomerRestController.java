package at.frebort.billing.frontend;

import at.frebort.billing.backend.dao.CustomerRepository;
import at.frebort.billing.backend.dto.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

   private final CustomerRepository repository;

   @Autowired
   public CustomerRestController(final CustomerRepository repository) {
      this.repository = repository;
   }

   @GetMapping("/customers")
   @ResponseBody
   public List<Customer> getCustomers() {
      return this.repository.findAll();
   }

   @GetMapping("/customers/{customerId}")
   @ResponseBody
   public Customer getCustomer(@PathVariable("customerId") final int id) {
      return this.repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("customer does not exist!"));
   }

   @PostMapping("/customers")
   public void insertCustomer(@RequestBody final Customer customer) {
      if (this.repository.existsById(customer.getCustomerId())) {
         throw new IllegalArgumentException("customer already exist!");
      }
      this.repository.save(customer);
   }

   @PutMapping("/customers")
   public void updateCustomer(@RequestBody final Customer customer) {
      this.repository.save(customer);
   }
}
