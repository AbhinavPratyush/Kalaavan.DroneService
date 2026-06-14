package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

import org.springframework.web.multipart.MultipartFile;

@Deprecated
public class PastShowsMmsDto {
    MultipartFile file;

    String name;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
