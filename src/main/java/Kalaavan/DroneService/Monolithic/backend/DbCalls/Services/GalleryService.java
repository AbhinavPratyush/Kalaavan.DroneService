package Kalaavan.DroneService.Monolithic.backend.DbCalls.Services;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.GalleryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class GalleryService {

    @Autowired
    GalleryImpl galleryImpl;

    public List<Gallery> loadingGallery(){
        return galleryImpl.findALl();
    }

    public Optional<Gallery> selectingGallery(String id){
        return galleryImpl.findById(id);
    }

    public String removedGallery(Gallery gallery){
        galleryImpl.delete(gallery);
        return "removed";
    }

    public String savingGallery(Gallery gallery){
        galleryImpl.save(gallery);
        return "saved";
    }

}
