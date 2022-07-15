package com.devpact.invoiceried.invoice.domain;

import lombok.Value;
import com.devpact.invoiceried.shared.vo.BankAccount;

@Value
public class InvoicePaymentType {
    MethodOfPayment methodOfPayment;
    BankAccount bankAccount;
}
