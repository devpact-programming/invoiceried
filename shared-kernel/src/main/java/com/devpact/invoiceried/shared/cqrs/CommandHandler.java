package com.devpact.invoiceried.shared.cqrs;

public interface CommandHandler<C extends Command, R extends CommandResponse> {
    R handle(C command);
}
