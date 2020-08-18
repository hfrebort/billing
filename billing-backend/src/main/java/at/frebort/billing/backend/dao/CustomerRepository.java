package at.frebort.billing.backend.dao;

import at.frebort.billing.backend.dto.Customer;
import at.frebort.billing.backend.dto.ZipCodeData;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

   @Query(value = "SELECT distinct new at.frebort.billing.backend.dto.ZipCodeData(c.zipCode, c.city) FROM Customer c")
   List<ZipCodeData> findZipCodeAndCity();
}
