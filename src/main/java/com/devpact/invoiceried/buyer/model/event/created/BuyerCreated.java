package com.devpact.invoiceried.buyer.model.event.created;

import com.devpact.invoiceried.shared.cqrs.Event;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.Builder;

@Builder
public class BuyerCreated implements Event {
    private String companyName;
    private Address address;
    private VatNumber vatNumber;
}
