package com.lex.dto;

import lombok.Data;

/**
 * @author Lex_Yu
 * @date 2022年12月23日
 */
@Data
public class LocationDTO {
	private String place;
    private String description;
    private double longitude;
    private double latitude;
}
