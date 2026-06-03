package Kalaavan.DroneService.Monolithic.backend.SecurityService;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

public class AdminFilter extends OncePerRequestFilter {
    @Autowired
    MyownAuthManager authManager;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String email=request.getQueryString();
        SecurityContextImpl sec=new SecurityContextImpl();
        sec.setAuthentication(authManager.authenticate(new UsernamePasswordAuthenticationToken(email,"")));//object i need to authenticate
        SecurityContextHolder.setContext(sec);
//        request.authenticate(response))
        //




        filterChain.doFilter(request,response);
    }
}
