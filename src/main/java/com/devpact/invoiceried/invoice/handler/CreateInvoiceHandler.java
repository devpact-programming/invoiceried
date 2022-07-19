package com.devpact.invoiceried.invoice.handler;

import com.devpact.invoiceried.invoice.domain.Invoice;
import com.devpact.invoiceried.invoice.domain.InvoiceNumber;
import com.devpact.invoiceried.invoice.domain.InvoiceRepository;
import com.devpact.invoiceried.invoice.domain.command.CreateInvoice;
import com.devpact.invoiceried.shared.cqrs.CommandHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateInvoiceHandler implements CommandHandler<CreateInvoice, CreateInvoiceResponse> {
    private final InvoiceRepository repository;

    @Override
    public CreateInvoiceResponse handle(CreateInvoice command) {
        var invoiceId = UUID.randomUUID();
        var invoice = new Invoice(
                invoiceId,
                InvoiceNumber.of(command.getInvoiceNumber())
        );

        repository.save(invoice);

        return CreateInvoiceResponse.of(invoice.getId());
    }
}
