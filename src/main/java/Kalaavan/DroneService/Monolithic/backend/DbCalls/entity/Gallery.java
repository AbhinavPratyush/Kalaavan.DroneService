package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;
import java.awt.*;

@Entity
@Table(name="gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    String video;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
