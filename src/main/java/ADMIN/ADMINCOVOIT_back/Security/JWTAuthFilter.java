package ADMIN.ADMINCOVOIT_back.Security;

import ADMIN.ADMINCOVOIT_back.Service.UtilisateurServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTAuthFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {


            AuthCredentials authCredentials= new AuthCredentials();

        try {
            authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class);

        } catch (IOException e) {
            /*throw new RuntimeException(e);*/
        }

        UsernamePasswordAuthenticationToken usernamepat = new UsernamePasswordAuthenticationToken(
                authCredentials.getEmail(),
                authCredentials.getMdp(),
                Collections.emptyList()
        );

        return getAuthenticationManager().authenticate(usernamepat);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {

        UtilisateurServiceImpl utilisateurService = (UtilisateurServiceImpl)authResult.getPrincipal();
        String token = TokenUtils.createToken(utilisateurService.getnom(), utilisateurService.getUsername());

        //response.addHeader("Authorisation", "Bearer " + token);
        response.addHeader("Authorization", "Bearer " + token);
        response.getWriter().flush();

        super.successfulAuthentication(request, response, chain, authResult);
    }
}
