package Kalaavan.DroneService.Monolithic.backend.ControllerService;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.DroneServiceDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.EmailDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.GalleryDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.PastShowsDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.HandlingService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnectController {

    @Autowired
    HandlingService handlingService;

    @PostMapping("/connect")
    public String cvc(@RequestBody EmailDto email){
    System.out.println(email+"ldknmfnmdflngldfnglndlgndlfgnkdfgnldg");
        return "Succesfull";
    }

    @PostMapping("/PastShows")
    public PastShowsDto hbh(){
        PastShowsDto pastShowsDto=new PastShowsDto();
        pastShowsDto.setItself(handlingService.pastShowsUser());
        return pastShowsDto;
    }

    @PostMapping("/Gallery")
    public GalleryDto vgh(){
        GalleryDto galleryDto=new GalleryDto();
        galleryDto.setItself(handlingService.galleryUser());
        return galleryDto;
    }

    @PostMapping("/DroneService")
    public DroneServiceDto gfhg(){
        DroneServiceDto droneServiceDto=new DroneServiceDto();
        droneServiceDto.setItself(handlingService.droneServicesUser());
        return droneServiceDto;
    }

    //Admin services

    @PostMapping("/admin/PastShows")
    public PastShowsDto sadhbh(){
        PastShowsDto pastShowsDto=new PastShowsDto();
        pastShowsDto.setItself(handlingService.pastShowsAdmin());
        return pastShowsDto;
    }

    @PostMapping("/admin/Gallery")
    public GalleryDto vghsd(){
        GalleryDto galleryDto=new GalleryDto();
        galleryDto.setItself(handlingService.galleryAdmin());
        return galleryDto;
    }

    @PostMapping("/admin/DroneService")
    public DroneServiceDto sdfgfhg(){
        DroneServiceDto droneServiceDto=new DroneServiceDto();
        droneServiceDto.setItself(handlingService.droneServicesAdmin());
        return droneServiceDto;
    }


}
