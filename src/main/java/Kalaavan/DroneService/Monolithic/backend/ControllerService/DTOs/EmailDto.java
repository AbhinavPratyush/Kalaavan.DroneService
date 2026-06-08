package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

public class EmailDto {
    String email;
//will add a few details on it
    public EmailDto() {
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
