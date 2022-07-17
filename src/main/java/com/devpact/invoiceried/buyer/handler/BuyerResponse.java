package com.devpact.invoiceried.buyer.handler;

import com.devpact.invoiceried.buyer.domain.Buyer;
import com.devpact.invoiceried.shared.cqrs.CommandResponse;
import lombok.Value;

@Value(staticConstructor = "of")
public class BuyerResponse implements CommandResponse {
    Buyer buyer;
}
