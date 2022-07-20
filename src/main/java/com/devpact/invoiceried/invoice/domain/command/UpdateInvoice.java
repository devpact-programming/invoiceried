package com.devpact.invoiceried.invoice.domain.command;

import com.devpact.invoiceried.shared.cqrs.Command;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
public class UpdateInvoice implements Command {
    private String id;

    private String invoiceNumber;

    @Builder.Default
    private Company buyer = Company.builder().build();
    @Builder.Default
    private Company seller = Company.builder().build();

    private LocalDate invoiceDate;
    private LocalDate saleDate;
    private LocalDate paymentDeadline;
    private String methodOfPayment;
    private String bankAccount;
    private String description;

    @Builder
    @Getter
    public static class Company {
        private String companyName;
        @Builder.Default
        private Address address = Address.builder().build();
        private String vatNumber;
    }

    @Builder
    @Getter
    public static class Address {
        private String street;
        private String building;
        private String local;
        private String postalCode;
        private String city;
        private String country;
    }
}
