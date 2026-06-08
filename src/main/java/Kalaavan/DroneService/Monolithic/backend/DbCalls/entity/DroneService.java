package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drone_service")
public class DroneService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long serviceId;

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

    public long getServiceId() {
        return serviceId;
    }

    public void setServiceId(long serviceId) {
        this.serviceId = serviceId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
