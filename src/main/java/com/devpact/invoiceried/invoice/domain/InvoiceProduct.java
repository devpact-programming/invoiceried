package com.devpact.invoiceried.invoice.domain;

import com.devpact.invoiceried.shared.vo.VatRate;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class InvoiceProduct {
    String name;
    BigDecimal priceNetto;
    VatRate vatRate;
}
