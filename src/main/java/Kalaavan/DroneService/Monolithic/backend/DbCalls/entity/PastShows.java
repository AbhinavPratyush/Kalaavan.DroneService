package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Entity
@Table(name="past_shows")
public class PastShows {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    String name;

    String image;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
