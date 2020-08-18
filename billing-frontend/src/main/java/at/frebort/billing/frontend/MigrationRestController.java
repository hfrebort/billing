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

import at.frebort.billing.backend.service.LegacyCustomerService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hfrebort
 * @version 16.08.2020
 */
@RestController
public class MigrationRestController {

   private final LegacyCustomerService service;

   /**
    * Constructor.
    *
    * @param service
    */
   public MigrationRestController(final LegacyCustomerService service) {
      this.service = service;
   }

   @GetMapping("/migrate")
   @ResponseBody
   public List<String> migrate() {
      return this.service.migrate();
   }

}
