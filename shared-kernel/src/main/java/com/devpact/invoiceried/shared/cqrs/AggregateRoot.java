package com.devpact.invoiceried.shared.cqrs;

import java.util.UUID;

public abstract class AggregateRoot {
    public abstract UUID getId();
}
