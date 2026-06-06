package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection="Customers")
public class ContactDetails {
    String name;
    String email;
    String decription;
}
