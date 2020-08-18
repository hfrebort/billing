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
package at.frebort.billing.frontend;

import at.frebort.billing.backend.dto.ZipCodeData;
import at.frebort.billing.backend.service.ZipCodeService;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class ZipCodeRestController.
 */
@RestController
public class ZipCodeRestController {

   /** The service. */
   private final ZipCodeService service;

   /**
    * Instantiates a new zip code rest controller.
    *
    * @param service the service
    */
   public ZipCodeRestController(final ZipCodeService service) {
      this.service = service;
   }

   /**
    * Gets the zip codes.
    *
    * @return the zip codes
    */
   @GetMapping("/zipcodes")
   @ResponseBody
   public Set<ZipCodeData> getZipCodes() {
      return this.service.getZipCodeData();
   }

}
