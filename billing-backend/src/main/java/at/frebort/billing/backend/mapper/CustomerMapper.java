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
package at.frebort.billing.backend.mapper;

import at.frebort.billing.backend.dto.Customer;
import at.frebort.billing.load.mapper.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hfrebort
 * @version 16.08.2020
 */
public class CustomerMapper implements Mapper<Customer> {

   @Override
   public Customer map(final ResultSet resultSet) throws SQLException {
      final Customer customer = new Customer();
      customer.setCustomerId(resultSet.getInt("PKkunde"));
      //      customer.setCustomerId(resultSet.getInt("Kundennummer"));
      customer.setCompany(resultSet.getString("Firma"));
      customer.setFirstName(resultSet.getString("KontaktVorname"));
      customer.setLastName(resultSet.getString("KontaktNachname"));
      // TODO map all other attributes
      return customer;
   }
}
