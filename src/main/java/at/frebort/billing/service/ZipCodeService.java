package at.frebort.billing.service;

import at.frebort.billing.dao.CustomerRepository;
import at.frebort.billing.dto.ZipCodeData;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The Class ZipCodeService.
 */
@Service
public class ZipCodeService {

   /** The repository. */
   private final CustomerRepository repository;

   /**
    * Instantiates a new zip code service.
    *
    * @param repository the repository
    */
   @Autowired
   public ZipCodeService(final CustomerRepository repository) {
      this.repository = repository;
   }

   /**
    * Gets the zip code data.
    *
    * @return the zip code data
    */
   public Set<ZipCodeData> getZipCodeData() {
      return this.repository.findZipCodeAndCity().stream()
            .filter(z -> z.getZipCode() != null && !z.getZipCode().trim().isEmpty())
            .sorted(Comparator.comparing(ZipCodeData::getZipCode))
            .collect(Collectors.toSet());
   }
}
