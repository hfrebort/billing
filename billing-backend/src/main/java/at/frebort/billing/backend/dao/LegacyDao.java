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
package at.frebort.billing.backend.dao;

import at.frebort.billing.backend.mapper.Mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class LegacyDao.
 *
 * @author hfrebort
 * @version 16.08.2020
 * @param <E> the element type
 */
public class LegacyDao<E> {

   /** The Constant LOGGER. */
   private static final Logger LOGGER = LoggerFactory.getLogger(LegacyDao.class);

   /** The Constant DATABASE_URL. */
   private static final String DATABASE_URL = "jdbc:ucanaccess://.//src//main//resources//KuchlerBMD.mdb";
   // TODO use mdb file as a parameter

   /** The mapper. */
   private final Mapper<E> mapper;

   /**
    * Constructor.
    *
    * @param mapper the mapper
    */
   public LegacyDao(final Mapper<E> mapper) {
      this.mapper = mapper;
   }

   /**
    * Load.
    *
    * @param entityName the entity name
    * @return the list
    */
   public List<E> loadEntity(final String entityName) {
      return this.executeQuery("select * from " + entityName);
   }

   /**
    * Execute query.
    *
    * @param sqlStatement the sql statement
    * @return the list
    */
   public List<E> executeQuery(final String sqlStatement) {
      final List<E> entries = new ArrayList<>(50);

      try (final Connection connection = DriverManager.getConnection(DATABASE_URL);
            final Statement statement = connection.createStatement();
            final ResultSet result = statement.executeQuery(sqlStatement)) {

         while (result.next()) {
            final E entity = this.mapper.map(result);
            entries.add(entity);
            LOGGER.info("Mapped: {}", entity);
         }
      } catch (final SQLException ex) {
         LOGGER.error("Failed {} cause {}", sqlStatement, ex.getMessage());
      }

      return entries;
   }

}
