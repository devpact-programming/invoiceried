package com.devpact.invoiceried.invoice.handler;

import com.devpact.invoiceried.invoice.domain.Invoice;
import com.devpact.invoiceried.shared.cqrs.CommandResponse;
import lombok.Value;

@Value(staticConstructor = "of")
public class InvoiceResponse implements CommandResponse {
    Invoice invoice;
}
