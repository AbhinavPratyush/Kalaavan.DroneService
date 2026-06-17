package Kalaavan.DroneService.Monolithic.backend.SecurityService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.CompositeFilter;
import org.springframework.web.filter.CorsFilter;



@Configuration
public class SecutiyConfig {

    @Value("{$admin.username}")
    String adminIs;

    @Value("{$admin.password}")
    String how;

    @Bean
    UserDetailsService userDetailsService(){

        UserDetails admin= User.builder()
                .username(adminIs)
                .password(how)
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(admin);
    }


    @Bean
    public SecurityFilterChain SomeNameForFunc(HttpSecurity httpReqWillPassBySecurityFilterChain) throws Exception{

        return httpReqWillPassBySecurityFilterChain.authorizeHttpRequests(
                authorizeHttp->{
//                    authorizeHttp.anyRequest().OncePerRequestFilter.shouldNotFilter();
//                    authorizeHttp.requestMatchers("/index.html").anonymous();
                    authorizeHttp.requestMatchers("/user/**").permitAll();
                    authorizeHttp.requestMatchers("/admin/**").hasRole("Admin");
                }
                )
                .formLogin(Customizer.withDefaults())
        .build();

    }
}
