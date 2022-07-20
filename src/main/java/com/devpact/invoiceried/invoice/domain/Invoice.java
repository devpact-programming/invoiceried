package com.devpact.invoiceried.invoice.domain;

import com.devpact.invoiceried.shared.cqrs.AggregateRoot;
import com.google.common.collect.Lists;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Invoice extends AggregateRoot {
    @Getter
    private final UUID id;
    private InvoiceNumber invoiceNumber;
    private InvoiceBuyer buyer;
    private InvoiceSeller seller;
    private LocalDate invoiceDate;
    private LocalDate saleDate;
    private LocalDate paymentDeadline;
    private InvoicePaymentType invoicePaymentType;
    private String description;
    private List<InvoicePosition> invoicePositions;

    public Invoice(UUID id, InvoiceNumber invoiceNumber) {
        this.id = id;
        this.invoiceNumber = invoiceNumber;
        this.invoicePositions = Lists.newArrayList();
    }

    public void update(
            InvoiceNumber invoiceNumber,
            InvoiceBuyer buyer,
            InvoiceSeller seller,
            LocalDate invoiceDate,
            LocalDate saleDate,
            LocalDate paymentDeadline,
            InvoicePaymentType invoicePaymentType,
            String description) {
        this.invoiceNumber = invoiceNumber;
        this.seller = seller;
        this.buyer = buyer;
        this.invoiceDate = invoiceDate;
        this.saleDate = saleDate;
        this.paymentDeadline = paymentDeadline;
        this.invoicePaymentType = invoicePaymentType;
        this.description = description;
    }

    void updatePositions(List<InvoicePosition> positions) {
        invoicePositions.clear();
        invoicePositions.addAll(positions);
    }

    void print() {
        throw new UnsupportedOperationException();
    }
}
