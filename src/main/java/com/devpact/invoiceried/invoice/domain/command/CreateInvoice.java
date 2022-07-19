package com.devpact.invoiceried.invoice.domain.command;

import com.devpact.invoiceried.shared.cqrs.Command;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateInvoice implements Command {
    private String invoiceNumber;
}
