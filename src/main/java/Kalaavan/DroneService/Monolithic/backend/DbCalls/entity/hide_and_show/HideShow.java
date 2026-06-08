package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity.hide_and_show;

import jakarta.persistence.*;

@Entity
@Table(name="hide_show")
public class HideShow {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    @Column(nullable = false)
    private long services_id;

    @Column(nullable=false)
    private String service_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getServices_id() {
        return services_id;
    }

    public void setServices_id(long services_id) {
        this.services_id = services_id;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }
}
