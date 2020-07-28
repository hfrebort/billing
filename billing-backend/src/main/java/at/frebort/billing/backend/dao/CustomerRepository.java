package at.frebort.billing.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import at.frebort.billing.backend.dto.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
