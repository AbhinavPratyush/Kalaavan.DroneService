package Kalaavan.DroneService.Monolithic.backend.DbCalls.Services;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Projection.DroneServiceProjection;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Projection.PastShowsProjection;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.hide_and_show.HideShow;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.DroneServiceImpl;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.HideShowImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DroneServiceProvidedService {

    @Autowired
    DroneServiceImpl droneServiceImpl;

    @Autowired
    HideShowImpl hideShow;

    public List<DroneService> loadingServiceProvided(){
        List<DroneServiceProjection> p= hideShow.show_DroneService();
        ArrayList<DroneService> q=new ArrayList<>();
        for(DroneServiceProjection a:p){
            DroneService b=new DroneService();
            b.setServiceId(a.getServiceId());
            b.setDescription(a.getDescription());
            b.setPrice(a.getPrice());
            q.add(b);
        }
        return q;
    }

    public List<DroneService> loadingAllServiceProvided(){
        return droneServiceImpl.findAll();
    }

    public String saveThisService(DroneService droneService){
        droneServiceImpl.save(droneService);
        HideShow show=new HideShow();
        show.setServices_id(droneService.getServiceId());
        show.setService_name("drone");
        hideShow.save(show);
        return "Saved";
    }

    public String removeThisService(DroneService droneService){
        droneServiceImpl.delete(droneService);
        return "removed";
    }

    public String hideThisDroneService(DroneService droneService){
        //Take the id of drone service and use a list which is stored in db to
        HideShow hide=hideShow.findByServices_id(droneService.getServiceId());
        hideShow.delete(hide);

        return "Hid it";
    }

    public String showThisDroneService(DroneService droneService){
        HideShow show=new HideShow();
        show.setService_name("drone");
        show.setServices_id(droneService.getServiceId());
        hideShow.save(show);
        return "CHeck if Showing or not";

    }
}
