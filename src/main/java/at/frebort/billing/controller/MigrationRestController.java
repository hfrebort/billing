package at.frebort.billing.controller;

import at.frebort.billing.service.LegacyCustomerService;

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
