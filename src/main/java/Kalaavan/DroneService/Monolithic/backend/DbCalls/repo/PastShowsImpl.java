package Kalaavan.DroneService.Monolithic.backend.DbCalls.repo;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PastShowsImpl extends MongoRepository<PastShows,String> {
    List<PastShows> findAll();
    Optional<PastShows> findById(String id);

}
