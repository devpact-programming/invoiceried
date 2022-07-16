package com.devpact.invoiceried.buyer.infrastructure.persistence;

import com.devpact.invoiceried.buyer.domain.Buyer;
import com.devpact.invoiceried.buyer.domain.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InMemoryBuyerRepository implements BuyerRepository {
    private final Map<UUID, Buyer> buyers = new HashMap<>();

    @Override
    public UUID save(Buyer buyer) {
        buyers.put(buyer.getId(), buyer);

        return buyer.getId();
    }

    @Override
    public Optional<Buyer> find(UUID id) {
        return Optional.ofNullable(buyers.get(id));
    }

    @Override
    public List<Buyer> findAll() {
        return new ArrayList<>(buyers.values());
    }
}
