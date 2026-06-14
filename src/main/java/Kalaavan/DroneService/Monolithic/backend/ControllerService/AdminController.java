package Kalaavan.DroneService.Monolithic.backend.ControllerService;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.DroneServiceDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.GalleryDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.PastShowsDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.HandlingAdminServices;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Controller
public class AdminController {
    //there are three adding service required
    @Autowired
    HandlingAdminServices handlingAdminServices;


    @PostMapping("/admin/add/DroneService")
    public String jhbbvds(@RequestBody DroneServiceDto droneServiceDto){
        handlingAdminServices.addToDb(droneServiceDto);
        return "successful";
    }


    //-----------------------------------------------------------------------------------
    // there are three removal service required
    @PostMapping("/admin/delete/PastShows")
    public String khbjgn(@RequestBody PastShowsDto pastShowsDto) throws IOException, InterruptedException {
        handlingAdminServices.remove(pastShowsDto);
        return "successful";
    }

    @PostMapping("/admin/delete/Gallery")
    public String jasjav(@RequestBody GalleryDto gallery) throws IOException, InterruptedException {
        handlingAdminServices.remove(gallery);
        return "successful";
    }

    @PostMapping("/admin/delete/DroneService")
    public String nhfg(@RequestBody DroneServiceDto droneServiceDto){
        handlingAdminServices.remove(droneServiceDto);
        return "successful";
    }
    //-----------------------------------------------------------------------------------
    // there are three hiding service required
    @PostMapping("/admin/hide/PastShows")
    public String jhbdsfvcbhs(@RequestBody PastShowsDto pastShowsDto){
        handlingAdminServices.hide(pastShowsDto);
        return "successful";
    }

    @PostMapping("/admin/hide/Gallery")
    public String jsdwer(@RequestBody GalleryDto gallery){
        handlingAdminServices.hide(gallery);
        return "successful";
    }

    @PostMapping("/admin/hide/DroneService")
    public String jhbvds(@RequestBody DroneServiceDto droneServiceDto){
        handlingAdminServices.hide(droneServiceDto);
        return "successful";
    }

    //-----------------------------------------------------------------------------------
    // there are three showing service required
    @PostMapping("/admin/show/PastShows")
    public String bfvd(@RequestBody PastShowsDto pastShowsDto){
        handlingAdminServices.show(pastShowsDto);
        return "successful";
    }

    @PostMapping("/admin/show/Gallery")
    public String sihdh(@RequestBody GalleryDto gallery){
        handlingAdminServices.show(gallery);
        return "successful";
    }

    @PostMapping("/admin/show/DroneService")
    public String bvcasbc(@RequestBody DroneServiceDto droneServiceDto){
        handlingAdminServices.show(droneServiceDto);
        return "successful";
    }
}
