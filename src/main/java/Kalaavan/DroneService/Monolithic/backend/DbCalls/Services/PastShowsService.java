package Kalaavan.DroneService.Monolithic.backend.DbCalls.Services;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Projection.PastShowsProjection;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.hide_and_show.HideShow;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.HideShowImpl;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.repo.PastShowsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PastShowsService {
    @Autowired
    PastShowsImpl pastShows;
    @Autowired
    HideShowImpl hideShow;



    public List<PastShows> loadingPastShows(){
        List<PastShowsProjection> p= hideShow.show_PastShows();
        ArrayList<PastShows> q=new ArrayList<>();
        for(PastShowsProjection a:p){
            PastShows b=new PastShows();
            b.setId(a.getId());
            b.setName(a.getName());
            b.setImage(a.getImage());
            q.add(b);
        }
        return q;
    }


    public List<PastShows> loadingAllPastShows(){
        return pastShows.findAll();
    }

    public Optional<PastShows> selectingPastShows(long id){
        return pastShows.findById(id);
    }
    //
    public String saveThisService(PastShows pastShowsU){
        pastShows.save(pastShowsU);
        HideShow show=new HideShow();
        show.setServices_id(pastShowsU.getId());
        show.setService_name("past");
        hideShow.save(show);
        return "Saved";
    }

    public String removeThisService(PastShows pastShowsU){
        pastShows.delete(pastShowsU);
        return "removed";
    }

    public String hideThisPastShows(PastShows pastShowsU){
        //Take the id of drone service and use a list which is stored in db to
        HideShow hide=hideShow.findByServices_id(pastShowsU.getId());
        hideShow.delete(hide);
        return "Hid it";
    }


    public String showThisPastShow(PastShows pastShows){
        HideShow show= new HideShow();
        show.setService_name("past");
        show.setServices_id(pastShows.getId());
        hideShow.save(show);
        return "pastShow is showing";
    }

}
