package com.devpact.invoiceried.invoice.domain;

import lombok.Value;
import com.devpact.invoiceried.shared.vo.BankAccount;

@Value(staticConstructor = "of")
public class InvoicePaymentType {
    MethodOfPayment methodOfPayment;
    BankAccount bankAccount;
}
