package at.frebort.billing.backend.database;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * The Class ConnectionProvider.
 */
public final class ConnectionProvider {

    /**
     * Get the connection.
     * <p>
     * NOTE: do not forget to close the connection after each use of it!
     * <p>
     * The best case is to use the try-with-resources mechanism of java
     *
     * <pre>
     * try (final Connection connection = this.provider.getConnection();
     *      final PreparedStatement statement = connection.prepareStatement("select * from dual")) {
     *    final ResultSet resultSet = statement.executeQuery();
     *    ...
     * } catch (final SQLException e) {
     *    ...
     * }
     * </pre>
     *
     * @return the connection
     */
    public Connection getConnection() {
        try {
            final Context initContext = new InitialContext();
            final Context webContext = (Context) initContext.lookup("java:/comp/env");
            final DataSource dataSource = (DataSource) webContext.lookup("jdbc/billing");
            return dataSource.getConnection();
        } catch (final Exception e) {
            throw new RuntimeException("Can not provide connection! " + e.getMessage(), e);
        }
    }

}
