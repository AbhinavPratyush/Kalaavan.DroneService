package Kalaavan.DroneService.Monolithic.backend.SecurityService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.CompositeFilter;
import org.springframework.web.filter.CorsFilter;



@Configuration
public class SecutiyConfig {

    @Bean
    public SecurityFilterChain SomeNameForFunc(HttpSecurity httpReqWillPassBySecurityFilterChain) throws Exception{

        return httpReqWillPassBySecurityFilterChain.authorizeHttpRequests(
                authorizeHttp->{
//                    authorizeHttp.anyRequest().OncePerRequestFilter.shouldNotFilter();
//                    authorizeHttp.requestMatchers("/index.html").anonymous();
                    authorizeHttp.requestMatchers("/ connect","/index.html","/").permitAll();
                    authorizeHttp.requestMatchers("/admin/**").hasRole("Admin");
                    authorizeHttp.requestMatchers("/").hasAnyRole("Admin","User");
                }
                )

                .addFilterAfter(new AdminFilter(),
                        CorsFilter.class
                        )
        .build();

    }
}
