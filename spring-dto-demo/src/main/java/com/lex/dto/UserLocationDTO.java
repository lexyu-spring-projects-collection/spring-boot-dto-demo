package com.lex.dto;

import lombok.Data;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 8:58 pm
 */
@Data
public class UserLocationDTO {
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    
    private String place;
    private String description;
    private double longitude;
    private double latitude;

}
