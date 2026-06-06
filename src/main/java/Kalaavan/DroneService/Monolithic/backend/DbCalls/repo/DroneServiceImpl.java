package Kalaavan.DroneService.Monolithic.backend.DbCalls.repo;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DroneServiceImpl extends MongoRepository<DroneService,String>{
    List<DroneService> findAll();
}
