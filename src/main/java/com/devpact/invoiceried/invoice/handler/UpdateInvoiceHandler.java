package com.devpact.invoiceried.invoice.handler;

import com.devpact.invoiceried.invoice.domain.*;
import com.devpact.invoiceried.invoice.domain.command.UpdateInvoice;
import com.devpact.invoiceried.shared.cqrs.CommandHandler;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.BankAccount;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
class UpdateInvoiceHandler implements CommandHandler<UpdateInvoice, InvoiceResponse> {
    private final InvoiceRepository invoiceRepository;

    @Override
    public InvoiceResponse handle(UpdateInvoice command) {
        var invoiceId = UUID.fromString(command.getId());
        var invoice = invoiceRepository.find(invoiceId).orElseThrow();

        invoice.update(
                InvoiceNumber.of(command.getInvoiceNumber()),
                InvoiceBuyer.builder()
                        .companyName(command.getBuyer().getCompanyName())
                        .vatNumber(VatNumber.of(command.getBuyer().getVatNumber()))
                        .address(mapAddress(command.getBuyer().getAddress()))
                        .build(),
                InvoiceSeller.builder()
                        .companyName(command.getSeller().getCompanyName())
                        .vatNumber(VatNumber.of(command.getSeller().getVatNumber()))
                        .address(mapAddress(command.getSeller().getAddress()))
                        .build(),
                command.getInvoiceDate(),
                command.getSaleDate(),
                command.getPaymentDeadline(),
                InvoicePaymentType.of(
                        MethodOfPayment.valueOf(command.getMethodOfPayment()),
                        BankAccount.of(command.getBankAccount())),
                command.getDescription()
        );
        invoiceRepository.save(invoice);

        return InvoiceResponse.of(invoice);
    }

    private Address mapAddress(UpdateInvoice.Address address) {
        return Address.builder()
                .street(address.getStreet())
                .building(address.getBuilding())
                .local(address.getLocal())
                .postalCode(address.getPostalCode())
                .city(address.getCity())
                .country(address.getCountry())
                .build();
    }
}
