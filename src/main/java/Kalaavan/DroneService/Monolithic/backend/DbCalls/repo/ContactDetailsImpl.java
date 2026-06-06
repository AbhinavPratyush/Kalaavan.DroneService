package Kalaavan.DroneService.Monolithic.backend.DbCalls.repo;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.ContactDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactDetailsImpl extends MongoRepository<ContactDetails, String> {
}
