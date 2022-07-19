package com.devpact.invoiceried.invoice.domain;

import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.Builder;

@Builder
public class InvoiceBuyer {
    String companyName;
    Address address;
    VatNumber vatNumber;
}
