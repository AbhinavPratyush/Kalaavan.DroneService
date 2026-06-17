package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

public class EmailDto {
    String email;

    String name;

    String decription;
//will add a few details on it
    public EmailDto() {
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

    public EmailDto(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
