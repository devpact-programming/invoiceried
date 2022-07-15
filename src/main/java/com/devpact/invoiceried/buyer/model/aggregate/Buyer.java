package com.devpact.invoiceried.buyer.model.aggregate;

import com.devpact.invoiceried.shared.cqrs.AggregateRoot;
import lombok.AllArgsConstructor;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;

@AllArgsConstructor
public class Buyer implements AggregateRoot {
    private String companyName;
    private Address address;
    private VatNumber vatNumber;
}
