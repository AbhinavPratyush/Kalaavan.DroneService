package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import org.springframework.data.mongodb.core.mapping.Document;

public class DroneService {

    private String serviceId;
    private float price;
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /*
    * other necessary services
    *
    *
    * */

    public DroneService() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
