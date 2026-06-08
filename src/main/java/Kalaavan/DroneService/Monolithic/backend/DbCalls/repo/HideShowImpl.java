package Kalaavan.DroneService.Monolithic.backend.DbCalls.repo;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Projection.DroneServiceProjection;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Projection.GalleryProjection;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Projection.PastShowsProjection;
import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.hide_and_show.HideShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HideShowImpl extends JpaRepository<HideShow,Long> {


    HideShow findByServices_id(long services_id);



    /*
    * This query is meant to check for drone service to show
    * the drone service is a list of service availaible ,
    * now there are a few services you may intend to hide
    * just for festive season . To manage that this architechture is kept
    *
    *
    * */
    @Query(value="select d.serviceId,d.price,d.description" +
            " from drone_service d inner join hide_show h"+
            " on d.serviceId=h.service_id where h.service_name='drone'",
    nativeQuery=true
    )
    List<DroneServiceProjection> show_DroneService();


    /*
     * This query is meant to check for Gallery images to show
     * Gallery is a list of images that is intented to be kept,
     * now obviously you may want to hide few images and keep hem private
     *
     *
     * */
    @Query(value="select g.Id,g.video"+
            " from gallery g inner join hide_show h"+
            " on g.Id==h.service_id where h.service_name='gallery'",
            nativeQuery=true
    )
    List<GalleryProjection> show_Gallery();


    /*
     * This query is meant to check for PastShows to show
     *Same intent as other two show and hide system
     *
     * */
    @Query(value="select p.Id,p.name,p.image"+
            " from past_shows p inner join hide_show h"+
            " on p.Id=h.service_id where h.name='past",
            nativeQuery=true
    )
    List<PastShowsProjection> show_PastShows();

}
