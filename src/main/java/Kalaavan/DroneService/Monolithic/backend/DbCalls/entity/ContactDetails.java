package Kalaavan.DroneService.Monolithic.backend.DbCalls.entity;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Entity
@Table(schema = "contact_details")

public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "email" ,nullable = false)
    String email;

    String name;

    String decription;

    public ContactDetails() {
    }

    public ContactDetails(long id, String email, String name, String decription) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.decription = decription;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
