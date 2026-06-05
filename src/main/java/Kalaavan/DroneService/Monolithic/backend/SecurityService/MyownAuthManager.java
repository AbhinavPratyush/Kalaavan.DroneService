package Kalaavan.DroneService.Monolithic.backend.SecurityService;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Component
public class MyownAuthManager implements AuthenticationManager {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken;
        if(Objects.equals(authentication.getPrincipal(), "email=adminmail%40gmail.com")){
            usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(
                    authentication.getPrincipal(),authentication.getCredentials(),
                    List.of(new SimpleGrantedAuthority("Admin"),new SimpleGrantedAuthority("User")) //will figure it out later
            );
        }
        else{
            usernamePasswordAuthenticationToken=new UsernamePasswordAuthenticationToken(
                    authentication.getPrincipal(),authentication.getCredentials(),
                    List.of(new SimpleGrantedAuthority("User")) //will figure it out later
            );
        }

//        usernamePasswordAuthenticationToken.setAuthenticated(true);

        return usernamePasswordAuthenticationToken;

    }
}
