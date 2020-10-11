package at.frebort.billing.dao;

import at.frebort.billing.dto.Customer;
import at.frebort.billing.dto.ZipCodeData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

   @Query(value = "SELECT distinct new at.frebort.billing.dto.ZipCodeData(c.zipCode, c.city) FROM Customer c")
   List<ZipCodeData> findZipCodeAndCity();

   @Query(value = "SELECT max(c.customerId) FROM Customer c")
   Integer findMaxCustomerId();
}
