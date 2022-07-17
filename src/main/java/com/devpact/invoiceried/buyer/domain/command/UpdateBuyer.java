package com.devpact.invoiceried.buyer.domain.command;

import com.devpact.invoiceried.shared.cqrs.Command;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UpdateBuyer implements Command {
    private String id;
    private String companyName;
    private String street;
    private String building;
    private String local;
    private String postalCode;
    private String city;
    private String country;
    private String vatNumber;
}
