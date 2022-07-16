package com.devpact.invoiceried.shared.vo;

import lombok.Value;

@Value(staticConstructor = "of")
public class VatNumber {
    String number;

    public boolean isValid() {
        return number != null && !number.isBlank();
    }
}
