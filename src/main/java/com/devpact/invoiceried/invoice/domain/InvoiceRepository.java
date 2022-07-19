package com.devpact.invoiceried.invoice.domain;

import com.devpact.invoiceried.shared.cqrs.Repository;

import java.util.List;

public interface InvoiceRepository extends Repository<Invoice> {
    List<Invoice> findAll();
}
