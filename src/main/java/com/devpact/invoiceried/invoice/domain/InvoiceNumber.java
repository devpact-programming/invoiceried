package com.devpact.invoiceried.invoice.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class InvoiceNumber {
    String number;
}
