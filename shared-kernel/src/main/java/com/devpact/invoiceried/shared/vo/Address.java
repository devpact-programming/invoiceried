package com.devpact.invoiceried.shared.vo;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Address {
    private String street;
    private String building;
    private String local;
    private String postalCode;
    private String city;
    private String country;
}
