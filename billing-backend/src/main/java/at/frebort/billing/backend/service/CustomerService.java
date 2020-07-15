package at.frebort.billing.backend.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import at.frebort.billing.backend.database.ConnectionProvider;
import at.frebort.billing.backend.dto.Customer;

/**
 * The Class CustomerService.
 */
public class CustomerService {

    /** The Constant SELECT_FROM_CUSTOMER. */
    private static final String SELECT_FROM_CUSTOMER = "select * from customer";

    /** The provider. */
    private final ConnectionProvider provider = new ConnectionProvider();

    /**
     * Gets the customers.
     *
     * @return the customers
     */
    public List<Customer> getCustomers() {
        final List<Customer> customers = new ArrayList<>();

        try (final Connection connection = this.provider.getConnection();
                final PreparedStatement statement = connection.prepareStatement(SELECT_FROM_CUSTOMER)) {
            final ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                final Customer customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customerId"));
                customer.setFirstName(resultSet.getString("firstName"));
                customer.setLastName(resultSet.getString("lastName"));
                customers.add(customer);
            }
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
