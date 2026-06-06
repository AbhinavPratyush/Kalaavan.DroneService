package Kalaavan.DroneService.Monolithic.backend.DbCalls.Services;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.DroneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneServiceProvidedService {

    @Autowired
    DroneServiceImpl droneServiceImpl;

    public List<DroneService> loadingServiceProvided(){
        return droneServiceImpl.findAll();
    }

    public String saveThisService(DroneService droneService){
        droneServiceImpl.save(droneService);
        return "Saved";
    }

    public String removeThisService(DroneService droneService){
        droneServiceImpl.delete(droneService);
        return "removed";
    }

    public String hideThisDroneService(DroneService droneService){
        //Take the id of drone service and use a list which is stored in db to
        return "Hid it";
    }

}
