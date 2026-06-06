package Kalaavan.DroneService.Monolithic.backend.DbCalls.repo;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface GalleryImpl extends MongoRepository<Gallery,String> {
    List<Gallery> findALl();
    Optional<Gallery> findById(String id);
}
