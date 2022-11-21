package com.lex.dto;

import lombok.Data;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 8:58 pm
 */
@Data
public class UserLocationDTO {
    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;

}
