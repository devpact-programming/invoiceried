package com.devpact.invoiceried.buyer.model.command.create;

import com.devpact.invoiceried.shared.cqrs.Command;
import lombok.Builder;

@Builder
public class CreateBuyer implements Command {
    private String companyName;
    private String street;
    private String building;
    private String local;
    private String postalCode;
    private String city;
    private String company;
    private String vatNumber;
}
