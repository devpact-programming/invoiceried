package com.devpact.invoiceried.shared.vo;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class VatRate {
    BigDecimal vatRate;
}
