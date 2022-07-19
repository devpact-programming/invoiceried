package com.devpact.invoiceried.invoice.handler;

import com.devpact.invoiceried.shared.cqrs.CommandResponse;
import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "of")
public class CreateInvoiceResponse implements CommandResponse {
    UUID id;
}
