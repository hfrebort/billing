package at.frebort.billing.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The Interface Mapper.
 *
 * @param <E> the element type
 */
public interface Mapper<E> {

   /**
    * Map.
    *
    * @param resultSet the result set
    * @return the e
    * @throws SQLException the SQL exception
    */
   E map(ResultSet resultSet) throws SQLException;
}
