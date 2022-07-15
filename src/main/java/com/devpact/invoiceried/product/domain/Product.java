package com.devpact.invoiceried.product.domain;

import com.devpact.invoiceried.shared.vo.VatRate;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal priceNetto;
    private VatRate vatRate;
}
