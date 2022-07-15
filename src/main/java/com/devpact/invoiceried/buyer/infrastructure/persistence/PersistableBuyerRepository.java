package com.devpact.invoiceried.buyer.infrastructure.persistence;

import com.devpact.invoiceried.buyer.model.aggregate.Buyer;
import com.devpact.invoiceried.buyer.model.aggregate.BuyerRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersistableBuyerRepository implements BuyerRepository {

    @Override
    public UUID save(Buyer buyer) {
        var id = UUID.randomUUID();
        try {
            var buyerBytes = new ObjectMapper().writeValueAsBytes(buyer);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    @Override
    public Optional<Buyer> find(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Buyer> findAll() {
        return List.of();
    }
}
