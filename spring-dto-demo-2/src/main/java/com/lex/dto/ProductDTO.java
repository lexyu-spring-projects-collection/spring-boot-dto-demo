package com.lex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:58 pm
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private String name;
    private String description;
    private BigDecimal prices;
}
