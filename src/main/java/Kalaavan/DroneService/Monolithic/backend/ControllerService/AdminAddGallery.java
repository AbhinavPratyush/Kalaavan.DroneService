package Kalaavan.DroneService.Monolithic.backend.ControllerService;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.DroneServiceDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.GalleryDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.PastShowsDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.BucketServ.ImageVideoUploadingService;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.HandlingAdminServices;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;


@RestController
@RequestMapping("/admin/add/Gallery")
public class AdminAddGallery {

    @Autowired
    HandlingAdminServices handlingAdminServices;

    @Autowired
    ImageVideoUploadingService imageVideoUploadingService;

    @PostMapping(value = "upload")
    public String askjbf(
            @RequestPart("dto") GalleryDto galleryDto,
            @RequestPart("file") MultipartFile file){


        String resp=imageVideoUploadingService.uploadIt(file);
        if("nope failed invalid file".contains(resp)){
            return "Unsucessfull";
        }
        else{
            ArrayList<Gallery> a= (ArrayList<Gallery>) galleryDto.getItself();
            for(Gallery i:a){i.setVideo(resp);
            }
            galleryDto.setItself(a);

            handlingAdminServices.addToDb(galleryDto);
            return "succesfull";
        }




    }

}
