package at.frebort.billing.mapper;

import at.frebort.billing.dto.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

/**
 * The Class CustomerMapper.
 *
 * @author hfrebort
 * @version 16.08.2020
 */
@Component
public class CustomerMapper implements Mapper<Customer> {

   @Override
   public Customer map(final ResultSet resultSet) throws SQLException {
      final Customer customer = new Customer();
      // TODO verify if PKkunde has to be used customer.setCustomerId(resultSet.getInt("PKkunde"))
      customer.setCustomerId(resultSet.getInt("Kundennummer"));
      customer.setCompany(resultSet.getString("Firma"));
      customer.setFirstName(resultSet.getString("KontaktVorname"));
      customer.setLastName(resultSet.getString("KontaktNachname"));
      customer.setCity(resultSet.getString("Ort"));
      customer.setZipCode(resultSet.getString("Postleitzahl"));
      customer.setAddress(resultSet.getString("Adresse"));
      // TODO map all other attributes
      return customer;
   }
}
