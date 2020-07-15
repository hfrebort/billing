package at.frebort.billing.backend.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import at.frebort.billing.backend.database.ConnectionProvider;

/**
 * The Class InitializeDatabaseService.
 */
public class InitializeDatabaseService {

    /** The Constant CREATE_CUSTOMER_DDL. */
    private static final String CREATE_CUSTOMER_DDL =
            "create table if not exists customer ("
                    + " customerId bigint auto_increment primary key,"
                    + " firstName varchar(255),"
                    + " lastName varchar(255)"
                    + ");";

    /** The Constant INSERT_CUSTOMER_SQL. */
    private static final String INSERT_CUSTOMER_SQL = "insert into customer (firstName, lastName) values (?,?);";

    /** The provider. */
    private final ConnectionProvider provider = new ConnectionProvider();

    /**
     * Creates the and import.
     */
    public void createAndImport() {
        createTable();
        importCustomers();
    }

    private void createTable() {

        try (final Connection connection = this.provider.getConnection();
                final PreparedStatement statement = connection.prepareStatement(CREATE_CUSTOMER_DDL)) {
            statement.executeUpdate();
        } catch (final SQLException e) {
            e.printStackTrace();
        }
    }

    private void importCustomers() {
        try (final Connection connection = this.provider.getConnection();
                final PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            statement.setString(1, "harald");
            statement.setString(2, "frebort");
            statement.executeUpdate();
        } catch (final SQLException e) {
            e.printStackTrace();
        }
    }
}
