package com.example.aiback.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Geo {
    private String lat;
    private String lng;
}
