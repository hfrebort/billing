package at.frebort.billing.frontend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import at.frebort.billing.backend.dao.CustomerRepository;
import at.frebort.billing.backend.dto.Customer;

@RestController
public class CustomerController {

    private final CustomerRepository repository;

    @Autowired
    public CustomerController(final CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    @ResponseBody
    public List<Customer> getCustomers() {
        return this.repository.findAll();
    }
}
