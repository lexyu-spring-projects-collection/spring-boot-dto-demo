package com.lex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:55 pm
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    @JsonFormat(pattern = "yyyy-HH-dd HH:mm:ss")
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @JsonFormat(pattern = "yyyy-HH-dd HH:mm:ss")
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

}
