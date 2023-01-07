package ADMIN.ADMINCOVOIT_back.Security;

import lombok.Data;

@Data
public class AuthCredentials {
    private String email;
    private String mdp;
}
