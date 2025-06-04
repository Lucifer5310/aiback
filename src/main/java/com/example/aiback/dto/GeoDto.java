package com.example.aiback.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class GeoDto {
    @NotBlank
    private String lat;
    @NotBlank
    private String lng;
}
