package at.frebort.billing.backend.dao;

import at.frebort.billing.backend.dto.ZipCodeData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZipCodeRepository extends JpaRepository<ZipCodeData, String> {

}
