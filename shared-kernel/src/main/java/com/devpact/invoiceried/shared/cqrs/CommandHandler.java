package com.devpact.invoiceried.shared.cqrs;

public interface CommandHandler<C extends Command> {
    void handle(C command);
}
