package com.example.aiback.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CompanyDto {
    @NotBlank
    private String name;
    @NotBlank
    private String catchPhrase;
    @NotBlank
    private String bs;
}
