package com.devpact.invoiceried.invoice.domain.command;

import com.devpact.invoiceried.shared.cqrs.Command;
import com.devpact.invoiceried.shared.vo.VatRate;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Builder
@Getter
public class UpdateInvoicePositions implements Command {
    private UUID id;

    private int positonNumber;
    private String productName;
    private BigDecimal productPriceNetto;
    private VatRate productVatRate;
    private int quantity;
}
