package com.devpact.invoiceried.invoice.infrastructure.persistence;

import com.devpact.invoiceried.invoice.domain.Invoice;
import com.devpact.invoiceried.invoice.domain.InvoiceRepository;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InMemoryInvoiceRepository implements InvoiceRepository {
    private final Map<UUID, Invoice> invoices = Maps.newHashMap();

    @Override
    public UUID save(Invoice invoice) {
        invoices.put(invoice.getId(), invoice);

        return invoice.getId();
    }

    @Override
    public Optional<Invoice> find(UUID id) {
        return Optional.ofNullable(invoices.get(id));
    }

    @Override
    public List<Invoice> findAll() {
        return new ArrayList<>(invoices.values());
    }
}
