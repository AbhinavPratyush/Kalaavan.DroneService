package Kalaavan.DroneService.Monolithic.backend.ControllerService;

import Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs.EmailDto;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnectController {

    @PostMapping("/connect")
    public String cvc(@RequestBody EmailDto email){
    System.out.println(email+"ldknmfnmdflngldfnglndlgndlfgnkdfgnldg");
        return "Succesfull";
    }

    @PostMapping("/PastShows")
    public PastShowsDto hbh(){
        PastShowsDto
        return pastShowsDto;
    }

}
