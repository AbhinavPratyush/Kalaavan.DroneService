package Kalaavan.DroneService.Monolithic.backend.ControllerService.Services;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.Services.DroneServiceProvidedService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.Services.GalleryService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.Services.PastShowsService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HandlingService {

    @Autowired
    PastShowsService pastShowsService;
    @Autowired
    GalleryService galleryService;
    @Autowired
    DroneServiceProvidedService droneServiceProvidedService;


    public List<PastShows> pastShowsUser(){
        return pastShowsService.loadingPastShows();
    }


    public List<Gallery> galleryUser(){
        return galleryService.loadingGallery();
    }

    public List<DroneService> droneServicesUser(){
        return droneServiceProvidedService.loadingServiceProvided();
    }

    public List<PastShows> pastShowsAdmin(){
        return pastShowsService.loadingAllPastShows();
    }


    public List<Gallery> galleryAdmin(){
        return galleryService.loadingAllGallery();
    }

    public List<DroneService> droneServicesAdmin(){
        return droneServiceProvidedService.loadingAllServiceProvided();
    }
}
