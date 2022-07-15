package com.devpact.invoiceried.buyer.model.aggregate;

import com.devpact.invoiceried.shared.cqrs.Repository;

import java.util.List;

public interface BuyerRepository extends Repository<Buyer> {
    List<Buyer> findAll();
}
