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

import at.frebort.billing.backend.dto.ZipCodeData;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

/**
 * The Class PostalMapper.
 *
 * @author hfrebort
 * @version 18.08.2020
 */
@Component
public class ZipCodeMapper implements Mapper<ZipCodeData> {

   /**
    * Map.
    *
    * @param resultSet the result set
    * @return the zip code data
    * @throws SQLException the SQL exception
    */
   @Override
   public ZipCodeData map(final ResultSet resultSet) throws SQLException {
      final ZipCodeData zip = new ZipCodeData();
      zip.setZipCode(resultSet.getString("Postleitzahl"));
      zip.setCity(resultSet.getString("Ort"));
      return zip;
   }

}
