package Kalaavan.DroneService.Monolithic.backend.ControllerService.Services;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.DroneServiceDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.GalleryDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.PastShowsDto;
import org.springframework.stereotype.Service;

@Service
public class HandlingAdminServices {

    // these DTOs has img/vid name string set to null
    // but we can't use getMultipartFile() on huge files . system will be incredibly slow
    // so we have to use another part

    public void addToDb(PastShowsDto pastShowsDto){

    }

    public void addToDb(GalleryDto galleryDto){

    }

    public void addToDb(DroneServiceDto droneServiceDto){

    }

    //These dto are norm
}
