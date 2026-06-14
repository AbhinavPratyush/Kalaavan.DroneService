package Kalaavan.DroneService.Monolithic.backend.ControllerService.Services;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.DroneServiceDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.GalleryDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.PastShowsDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.BucketServ.ImageVideoDeletingService;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.BucketServ.ImageVideoUploadingService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.Services.DroneServiceProvidedService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.Services.GalleryService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.Services.PastShowsService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import com.mongodb.lang.NonNull;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class HandlingAdminServices {

    // these DTOs has img/vid name string set to null
    // but we can't use getMultipartFile() on huge files . system will be incredibly slow
    // so we have to use another part

    @Autowired
    PastShowsService pastShowsService;

    @Autowired
    GalleryService galleryService;

    @Autowired
    DroneServiceProvidedService droneServ;


    //-----------------------------------------------------------------------------------

    //add
    public void addToDb(PastShowsDto pastShowsDto){
        List<PastShows> a=pastShowsDto.getItself();
        for(PastShows i: a){
            pastShowsService.saveThisService(i);
        }

    }

    public void addToDb(GalleryDto galleryDto){
        List<Gallery> a=galleryDto.getItself();
        for(Gallery i: a){
            galleryService.saveThisService(i);
        }
    }

    public void addToDb(DroneServiceDto droneServiceDto){
        List<DroneService> a=droneServiceDto.getItself();
        for(DroneService i:a){
            droneServ.saveThisService(i);
        }
    }

    //-----------------------------------------------------------------------------------

    //hide
    public void hide(@NonNull PastShowsDto pastShowsDto){
        List<PastShows> a=pastShowsDto.getItself();
        for(PastShows i:a){
            pastShowsService.hideThisPastShows(i);
        }
    }

    public void hide(@NonNull GalleryDto galleryDto){
        List<Gallery> a=galleryDto.getItself();
        for(Gallery i:a){
            galleryService.hideThisGallery(i);
        }
    }

    public void hide(@NonNull DroneServiceDto droneServiceDto){
        List<DroneService> a=droneServiceDto.getItself();
        for(DroneService i:a){
            droneServ.hideThisDroneService(i);
        }
    }
    //These dto are norm

    //-----------------------------------------------------------------------------------

    //remove
    @Autowired
    ImageVideoDeletingService imageVideoDeletingService;

    @Transactional
    public void remove(@NonNull PastShowsDto pastShowsDto) throws IOException, InterruptedException {
        List<PastShows> a=pastShowsDto.getItself();
        for(PastShows i:a){
            imageVideoDeletingService.deleteIt(i.getName());
            pastShowsService.removeThisService(i);
        }
    }

    @Transactional
    public void remove(@NonNull GalleryDto galleryDto) throws IOException, InterruptedException {
        List<Gallery> a=galleryDto.getItself();
        for(Gallery i:a){
            imageVideoDeletingService.deleteIt(i.getVideo());
            galleryService.removeThisService(i);
        }
    }

    public void remove(@NonNull DroneServiceDto droneServiceDto){
        List<DroneService> a=droneServiceDto.getItself();
        for(DroneService i:a){
            droneServ.removeThisService(i);
        }
    }


    //-----------------------------------------------------------------------------------

    //show

    public void show(@NonNull PastShowsDto pastShowsDto){
        List<PastShows> a=pastShowsDto.getItself();
        for(PastShows i:a){
            pastShowsService.showThisPastShow(i);
        }
    }

    public void show(@NonNull GalleryDto galleryDto){
        List<Gallery> a=galleryDto.getItself();
        for(Gallery i:a){
            galleryService.showThisService(i);
        }
    }

    public void show(@NonNull DroneServiceDto droneServiceDto){
        List<DroneService> a=droneServiceDto.getItself();
        for(DroneService i:a){
            droneServ.showThisDroneService(i);
        }
    }

}
