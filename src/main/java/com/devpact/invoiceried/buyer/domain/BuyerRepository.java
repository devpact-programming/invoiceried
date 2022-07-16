package com.devpact.invoiceried.buyer.domain;

import com.devpact.invoiceried.shared.cqrs.Repository;

import java.util.List;

public interface BuyerRepository extends Repository<Buyer> {
    List<Buyer> findAll();
}
