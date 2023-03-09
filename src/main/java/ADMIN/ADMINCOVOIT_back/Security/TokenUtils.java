package ADMIN.ADMINCOVOIT_back.Security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class TokenUtils {
    private final static  String ACCES_TOKEN_SECRET = "4qhq8LrEBfYcaRHxhdb9zURb2rf8e7Ud";

    private final static Long ACCES_TOKEN_VALIDITY_SECONDS= 72000L;



    public static String createToken(String nom, String email,String statut){
        long expirationTime = ACCES_TOKEN_VALIDITY_SECONDS * 1000;
        Date expirationDate = new Date(System.currentTimeMillis()+expirationTime);


        Map<String, Object> extra = new HashMap<>();
        extra.put("nom", nom);
        extra.put("statut",statut);

        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCES_TOKEN_SECRET.getBytes()))
                .compact();
    }


    public static UsernamePasswordAuthenticationToken getauthentication(String token){
       try {
           Claims claims = Jwts.parserBuilder()
                   .setSigningKey(ACCES_TOKEN_SECRET.getBytes())
                   .build()
                   .parseClaimsJws(token)
                   .getBody();

           String email = claims.getSubject();

           return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());

       }catch (JwtException e){
           return null;
       }
    }
}
