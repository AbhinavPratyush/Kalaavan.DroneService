package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.Gallery;

import java.util.List;

public class GalleryDto {
    List<Gallery> itself;

    public List<Gallery> getItself() {
        return itself;
    }

    public void setItself(List<Gallery> itself) {
        this.itself = itself;
    }
}
