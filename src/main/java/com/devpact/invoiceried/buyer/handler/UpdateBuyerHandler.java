package com.devpact.invoiceried.buyer.handler;

import com.devpact.invoiceried.buyer.domain.BuyerRepository;
import com.devpact.invoiceried.buyer.domain.command.UpdateBuyer;
import com.devpact.invoiceried.shared.cqrs.CommandHandler;
import com.devpact.invoiceried.shared.vo.Address;
import com.devpact.invoiceried.shared.vo.VatNumber;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UpdateBuyerHandler implements CommandHandler<UpdateBuyer, BuyerResponse> {
    private final BuyerRepository repository;

    @Override
    public BuyerResponse handle(UpdateBuyer command) {
        var buyerId = UUID.fromString(command.getId());

        var buyer = repository.find(buyerId).orElseThrow();
        buyer.update(command.getCompanyName(),
                Address.builder()
                        .street(command.getStreet())
                        .building(command.getBuilding())
                        .local(command.getLocal())
                        .postalCode(command.getPostalCode())
                        .city(command.getCity())
                        .country(command.getCountry())
                        .build(),
                VatNumber.of(command.getVatNumber()));

        repository.save(buyer);

        return BuyerResponse.of(buyer);
    }
}
