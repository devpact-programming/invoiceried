package com.devpact.invoiceried.invoice.domain;

import com.devpact.invoiceried.shared.vo.VatRate;

import java.math.BigDecimal;

public class InvoiceProduct {
    private String name;
    private BigDecimal priceNetto;
    private VatRate vatRate;
}
