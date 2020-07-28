package at.frebort.billing.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import at.frebort.billing.backend.dao.CustomerRepository;
import at.frebort.billing.backend.dto.Customer;

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
    public void insertCustomers() {
        //        this.repository.insertCustomer();
    }
}
