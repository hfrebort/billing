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
package at.frebort.billing.backend.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class ZipCodeData.
 *
 * @author hfrebort
 * @version 18.08.2020
 */
@Entity
public class ZipCodeData {

   /** The zip code. */
   @Id
   private String zipCode;

   /** The city. */
   private String city;

   /**
    * Gets the zip code.
    *
    * @return the zip code
    */
   public String getZipCode() {
      return this.zipCode;
   }

   /**
    * Sets the zip code.
    *
    * @param zipCode the new zip code
    */
   public void setZipCode(final String zipCode) {
      this.zipCode = zipCode;
   }

   /**
    * Gets the city.
    *
    * @return the city
    */
   public String getCity() {
      return this.city;
   }

   /**
    * Sets the city.
    *
    * @param city the new city
    */
   public void setCity(final String city) {
      this.city = city;
   }

}
