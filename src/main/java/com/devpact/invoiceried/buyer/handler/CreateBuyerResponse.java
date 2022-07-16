package com.devpact.invoiceried.buyer.handler;

import com.devpact.invoiceried.shared.cqrs.CommandResponse;
import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "of")
public class CreateBuyerResponse implements CommandResponse {
    UUID id;
}
