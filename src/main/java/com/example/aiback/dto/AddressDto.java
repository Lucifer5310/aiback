package com.example.aiback.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddressDto {
    @NotBlank
    private String street;
    @NotBlank
    private String suite;
    @NotBlank
    private String city;
    @NotBlank
    private String zipcode;
    @NotNull
    private GeoDto geo;
}
