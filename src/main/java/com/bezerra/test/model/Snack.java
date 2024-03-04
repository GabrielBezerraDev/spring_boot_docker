package com.bezerra.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class Snack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mainSnack;

    private String beverage;

    private String sideDish;


}
