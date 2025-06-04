package com.example.aiback.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @Email
    private String email;

    private String phone;
    private String website;

    @NotNull
    private AddressDto address;

    @NotNull
    private CompanyDto company;
}
