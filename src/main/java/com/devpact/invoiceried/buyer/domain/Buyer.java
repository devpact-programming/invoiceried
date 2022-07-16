package com.devpact.invoiceried.buyer.domain;

import com.devpact.invoiceried.shared.cqrs.AggregateRoot;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
public class Buyer extends AggregateRoot {
    @Getter
    private UUID id;
    private String companyName;
    private Address address;
    private VatNumber vatNumber;
}
