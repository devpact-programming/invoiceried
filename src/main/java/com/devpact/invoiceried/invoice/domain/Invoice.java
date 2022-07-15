package com.devpact.invoiceried.invoice.domain;

import java.time.LocalDate;
import java.util.List;

public class Invoice {
    private InvoiceBuyer seller;
    private InvoiceSeller buyer;
    private InvoiceNumber invoiceNumber;
    private LocalDate invoiceDate;
    private LocalDate saleDate;
    private LocalDate paymentDeadline;
    private InvoicePaymentType invoicePaymentType;
    private String description;
    private List<InvoicePosition> invoicePositions;
}
