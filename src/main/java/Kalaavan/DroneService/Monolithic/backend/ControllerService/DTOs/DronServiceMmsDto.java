package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

import Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.DroneService;
import org.springframework.web.multipart.MultipartFile;

public class DronServiceMmsDto  {
    MultipartFile  file;
    private float price;

    private String description;



    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
