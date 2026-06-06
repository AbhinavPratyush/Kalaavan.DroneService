package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import java.awt.*;

@Document(collection = "galleryV")
public class Gallery {
    String Id;
    Image[] video;
}
