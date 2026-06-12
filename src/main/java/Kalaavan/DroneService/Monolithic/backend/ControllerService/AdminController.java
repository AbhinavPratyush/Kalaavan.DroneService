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

@Controller
public class AdminController {
    //there are three adding service required
    @Autowired
    HandlingAdminServices handlingAdminServices;

    @PostMapping("/admin/add/PastShows")
    public String jhbvcbhs(@RequestBody PastShowsDto pastShowsDto){
        handlingAdminServices.addToDb(pastShowsDto);
        return "successful";
    }

    @PostMapping("/admin/add/Gallery")
    public String jsd(@RequestBody GalleryDto gallery){
        handlingAdminServices.addToDb(gallery);
        return "successful";
    }

    @PostMapping("/admin/add/DroneService")
    public String jhbbvds(@RequestBody DroneServiceDto droneServiceDto){
        handlingAdminServices.addToDb(droneServiceDto);
        return "successful";
    }
    // there are three removal service required
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
    // there are three showing service required

}
