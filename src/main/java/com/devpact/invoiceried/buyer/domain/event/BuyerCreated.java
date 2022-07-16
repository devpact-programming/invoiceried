package com.devpact.invoiceried.buyer.domain.event;

import com.devpact.invoiceried.shared.cqrs.Event;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Builder
@Getter
public class BuyerCreated implements Event {
    private UUID id;
    private String companyName;
    private Address address;
    private VatNumber vatNumber;
}
