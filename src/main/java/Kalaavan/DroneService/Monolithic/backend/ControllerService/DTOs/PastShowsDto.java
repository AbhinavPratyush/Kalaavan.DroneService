package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.PastShows;

import java.util.List;

public class PastShowsDto {
    List<PastShows> itself;

    public List<PastShows> getItself() {
        return itself;
    }

    public void setItself(List<PastShows> itself) {
        this.itself = itself;
    }
}
