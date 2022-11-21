package com.lex.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 5:44 pm
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "locations")
public class Location {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String place;
    private String description;
    private double longitude;
    private double latitude;

}
