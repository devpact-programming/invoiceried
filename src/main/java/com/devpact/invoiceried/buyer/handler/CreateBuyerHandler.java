package com.devpact.invoiceried.buyer.handler;

import com.devpact.invoiceried.buyer.domain.Buyer;
import com.devpact.invoiceried.buyer.domain.BuyerRepository;
import com.devpact.invoiceried.buyer.domain.command.CreateBuyer;
import com.devpact.invoiceried.shared.cqrs.CommandHandler;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateBuyerHandler implements CommandHandler<CreateBuyer, CreateBuyerResponse> {
    private final BuyerRepository repository;

    @Override
    public CreateBuyerResponse handle(CreateBuyer command) {
        var buyerId = UUID.randomUUID();
        var buyer = new Buyer(
                buyerId,
                command.getCompanyName(),
                Address.builder()
                        .street(command.getStreet())
                        .building(command.getBuilding())
                        .local(command.getLocal())
                        .postalCode(command.getPostalCode())
                        .city(command.getCity())
                        .country(command.getCountry())
                        .build(),
                VatNumber.of(command.getVatNumber())
        );

        repository.save(buyer);

        return CreateBuyerResponse.of(buyer.getId());
    }
}
