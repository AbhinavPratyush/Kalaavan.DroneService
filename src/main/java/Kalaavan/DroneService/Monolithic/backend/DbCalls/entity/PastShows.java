package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;

@Document(collection="pastShows")
public class PastShows {
    String Id;
    String name;
    Image image;
}
