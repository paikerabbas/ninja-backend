package org.ninja.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstname;
    private String middlename;
    private String lastname;
    private String email;
    private String mobile;
    private String country;
    private String password;

}
