package com.devpact.invoiceried.domain;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal priceNetto;
    private VatRate vatRate;
}
