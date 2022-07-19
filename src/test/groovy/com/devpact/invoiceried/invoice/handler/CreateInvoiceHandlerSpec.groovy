package com.devpact.invoiceried.invoice.handler


import com.devpact.invoiceried.invoice.domain.InvoiceRepository
import com.devpact.invoiceried.invoice.domain.command.CreateInvoice
import spock.lang.Specification

class CreateInvoiceHandlerSpec extends Specification {
    def repository = Mock(InvoiceRepository)

    def "should return id for new invoice"() {
        given:
            def command = CreateInvoice.builder().build()
            def handler = new CreateInvoiceHandler(repository);
        when:
            def result = handler.handle(command)
        then:
            result.getId() != null
    }

    def "should save new invoice with success"() {
        given:
            def command = CreateInvoice.builder().build()
            def handler = new CreateInvoiceHandler(repository);
        when:
            handler.handle(command)
        then:
            1* repository.save(_)
    }
}
