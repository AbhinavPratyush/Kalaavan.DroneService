package Kalaavan.DroneService.Monolithic.backend.ControllerService.Services.BucketServ;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Service
public class ImageVideoDeletingService {

    @Value("{$URL_Bucket}")
    String deleteAt;

    @Value("{$spring.datasource.username}")
    String username;
    @Value("{$spring.datasource.password}")
    String password;


    @Transactional
    public void deleteIt(String nameOfFile) throws IOException, InterruptedException {
    String cred=username+":"+password;
    String base64Auth= Base64
            .getEncoder()
            .encodeToString(cred.getBytes(StandardCharsets.UTF_8));
    HttpClient client=HttpClient.newHttpClient();

        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create(deleteAt+nameOfFile))
                .header("Authentication","Basic "+base64Auth)
                .header("Content-Type","application/json")
                .DELETE()
                .build();
        HttpResponse<String> response=client
                .send(
                        request,
                        HttpResponse.BodyHandlers.ofString()
                );
        if(response.statusCode()!=200){

            throw new RuntimeException("Supabase storage deletion failed! HTTP Status: "
                    + response.statusCode() + " - Response Body: " + response.body());
        }
    }
}

