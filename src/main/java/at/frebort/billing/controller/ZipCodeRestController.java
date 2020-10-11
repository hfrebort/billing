package at.frebort.billing.controller;

import at.frebort.billing.dto.ZipCodeData;
import at.frebort.billing.service.ZipCodeService;

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
