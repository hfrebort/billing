package at.frebort.billing.backend.database;

import org.junit.Test;

public class ConnectionProviderTest {

    @Test(expected = RuntimeException.class)
    public void testGetConnectionWithoutContextThrowsException() {
        new ConnectionProvider().getConnection();
    }
}
