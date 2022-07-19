package com.devpact.invoiceried.invoice.domain;

import lombok.Builder;

@Builder
public class InvoicePosition {
    int positonNumber;
    InvoiceProduct product;
    int quantity;
}
