package com.devpact.invoiceried.shared.vo;

import lombok.Value;

@Value(staticConstructor = "of")
public class BankAccount {
    String accountNumber;
}
