package com.user.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    private String addressLine1;
    private String city;
    private String state;
    private String country;
    private Integer zipcode;
}
