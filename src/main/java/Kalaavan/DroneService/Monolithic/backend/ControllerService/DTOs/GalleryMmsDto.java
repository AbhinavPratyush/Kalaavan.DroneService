package Kalaavan.DroneService.Monolithic.backend.ControllerService.DTOs;

import org.springframework.web.multipart.MultipartFile;

public class GalleryMmsDto {
    MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
