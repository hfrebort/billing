package at.frebort.billing.controller;

import at.frebort.billing.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class IdGeneratorRestController mainly generates IDs of customers, invoices and all other entities.
 */
@RestController
@RequestMapping(path = "/generate")
public class IdGeneratorRestController {

   /** The customer service. */
   private final CustomerService customerService;

   /**
    * Instantiates a new id generator rest controller.
    *
    * @param customerService the customer service
    */
   @Autowired
   public IdGeneratorRestController(final CustomerService customerService) {
      this.customerService = customerService;
   }

   /**
    * Gets the next customer id.
    *
    * @return the next customer id
    */
   @GetMapping("/customerid")
   @ResponseBody
   public Integer getNextCustomerId() {
      return this.customerService.getNextCustomerId();
   }
}
