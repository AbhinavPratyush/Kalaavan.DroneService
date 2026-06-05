package Kalaavan.DroneService.Monolithic.backend.ControllerService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConnectController {

    @PostMapping("/connect")
    public String cvc(@RequestParam String email){
    System.out.println(email+"ldknmfnmdflngldfnglndlgndlfgnkdfgnldg");
        return "Succesfull";
    }

}
