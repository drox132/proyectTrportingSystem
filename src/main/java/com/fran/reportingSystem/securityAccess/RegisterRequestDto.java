package com.fran.reportingSystem.securityAccess;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequestDto {

    private String email;
    private String username;
    private String password;
    private int idRol;

}
