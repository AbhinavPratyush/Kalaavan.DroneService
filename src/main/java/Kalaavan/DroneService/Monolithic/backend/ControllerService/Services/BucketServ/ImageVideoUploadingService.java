package Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.BucketServ;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class ImageVideoUploadingService {

    @Value("{$URL_Bucket}")
    String Upload_to;
    public String/* it must return url of the file */uploadIt(MultipartFile mms){

        if(mms.isEmpty()){
            return "Please Upload something";
        }

        String name=mms.getOriginalFilename();
        String ftype=mms.getContentType();
        if(ftype==null){
            return "nope ";
        }
        if(ftype.startsWith("image/"))
        {
            name="Images/"+name;
        }
        else if(ftype.startsWith("video/")){
            name="Videos/"+name;
        }
        else{
            return "invalid file";
        }

        File destination = new File(Upload_to+name);
        try {
            mms.transferTo(destination);
            return name;
        } catch (IOException e) {
            return "failed";
        }
    }


}
