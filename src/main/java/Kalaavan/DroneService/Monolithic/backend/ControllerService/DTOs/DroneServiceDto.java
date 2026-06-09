package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;

import java.util.List;

public class DroneServiceDto {
    List<DroneService> itself;

    public List<DroneService> getItself() {
        return itself;
    }

    public void setItself(List<DroneService> itself) {
        this.itself = itself;
    }
}
