package com.example.aiback.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    @Embedded
    private Geo geo;
}
