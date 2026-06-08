package Kalaavan.DroneService.Monolithic.backend.DbCalls.Services;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.hide_and_show.HideShow;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.GalleryImpl;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.HideShowImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class GalleryService {

    @Autowired
    GalleryImpl galleryImpl;

    @Autowired
    HideShowImpl hideShow;

    public List<Gallery> loadingGallery(){
        return galleryImpl.findAll();
    }

    public Optional<Gallery> selectingGallery(long id){
        return galleryImpl.findById(id);
    }
//
    public String saveThisService(Gallery gallery){
        galleryImpl.save(gallery);
        HideShow show=new HideShow();
        show.setServices_id(gallery.getId());
        show.setService_name("gallery");
        hideShow.save(show);
        return "Saved";
    }

    public String removeThisService(Gallery gallery){
        galleryImpl.delete(gallery);
        return "removed";
    }

    public String hideThisGallery(Gallery gallery){
        //Take the id of drone service and use a list which is stored in db to
        HideShow hide=hideShow.findByServices_id(gallery.getId());
        hideShow.delete(hide);
        return "Hid it";
    }


}
