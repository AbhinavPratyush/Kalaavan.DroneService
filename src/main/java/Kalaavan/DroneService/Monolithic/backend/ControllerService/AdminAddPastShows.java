package Kalaavan.DroneService.Monolithic.backend.ControllerService;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.PastShowsDto;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.BucketServ.ImageVideoUploadingService;
import Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.HandlingAdminServices;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin/add/PastShows")
public class AdminAddPastShows {

    @Autowired
    HandlingAdminServices handlingAdminServices;

    @Autowired
    ImageVideoUploadingService imageVideoUploadingService;

@PostMapping(value = "upload")
    public String askjbf(
            @RequestPart("dto") PastShowsDto pastShowsDto,
            @RequestPart("file")MultipartFile file){


    String resp=imageVideoUploadingService.uploadIt(file);
    if("nope failed invalid file".contains(resp)){
        return "Unsucessfull";
    }
    else{
    ArrayList<PastShows> a= (ArrayList<PastShows>) pastShowsDto.getItself();
    for(PastShows i:a){i.setName(resp);
    }
    pastShowsDto.setItself(a);

    handlingAdminServices.addToDb(
            pastShowsDto
    );
    return "succesfull";
    }




}

}
