package com.devpact.invoiceried.domain;

import java.util.List;

public class Invoice {
    private Seller seller;
    private Buyer buyer;
    private InvoiceNumber invoiceNumber;
    private List<InvoicePosition> invoicePositions;
}
