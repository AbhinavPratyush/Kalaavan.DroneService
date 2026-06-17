package Kalaavan.DroneService.Monolithic.backend.DbCalls.repo;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.ContactDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDetailsImpl extends JpaRepository<ContactDetails, Long> {
}
