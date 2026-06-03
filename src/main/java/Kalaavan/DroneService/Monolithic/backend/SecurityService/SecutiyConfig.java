package Kalaavan.DroneService.Monolithic.backend.SecurityService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.net.http.HttpRequest;

@Configuration
public class SecutiyConfig {

    @Bean
    public SecurityFilterChain SomeNameForFunc(HttpSecurity httpReqWillPassBySecurityFilterChain) throws Exception{

        return httpReqWillPassBySecurityFilterChain.authorizeHttpRequests(
                authorizeHttp->{
                    authorizeHttp.anyRequest().permitAll();
                }
                )

        .build();

    }
}
