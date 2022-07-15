package com.devpact.invoiceried.shared.cqrs;

import java.util.Optional;
import java.util.UUID;

public interface Repository<T extends AggregateRoot> {
    UUID save(T aggregate);
    Optional<T> find(UUID id);
}
