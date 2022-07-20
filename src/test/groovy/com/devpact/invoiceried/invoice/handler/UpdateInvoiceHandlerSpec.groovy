package com.devpact.invoiceried.invoice.handler


import com.devpact.invoiceried.invoice.domain.Invoice
import com.devpact.invoiceried.invoice.domain.InvoiceNumber
import com.devpact.invoiceried.invoice.domain.InvoiceRepository
import com.devpact.invoiceried.invoice.domain.MethodOfPayment
import com.devpact.invoiceried.invoice.domain.command.UpdateInvoice
import spock.lang.Specification

class UpdateInvoiceHandlerSpec extends Specification {
    def repository = Mock(InvoiceRepository)

    def "when invoice is updated succesfully then should return updated version of invoice"() {
        given:
            def invoiceId = UUID.randomUUID()
            def invoice = new Invoice(invoiceId, InvoiceNumber.of("2022/1"))
            repository.find(invoiceId) >> Optional.of(invoice)
            def command = UpdateInvoice.builder()
                    .id(invoiceId.toString())
                    .invoiceNumber("2022/1")
                    .buyer(UpdateInvoice.Company.builder()
                            .companyName("ACME")
                            .address(UpdateInvoice.Address.builder().build())
                            .build())
                    .methodOfPayment(MethodOfPayment.CASH_PAYMENT.name())
                    .build()

            def handler = new UpdateInvoiceHandler(repository)
        when:
            def result = handler.handle(command)
        then:
            result.getInvoice().getId() == invoiceId
            result.getInvoice().buyer.companyName == "ACME"
    }

    def "when invoice is updated without method of then should throw exception"() {
        given:
            def invoiceId = UUID.randomUUID()
            def invoice = new Invoice(invoiceId, InvoiceNumber.of("2022/1"))
            repository.find(invoiceId) >> Optional.of(invoice)
            def command = UpdateInvoice.builder()
                    .id(invoiceId.toString())
                    .build()

            def handler = new UpdateInvoiceHandler(repository)
        when:
            handler.handle(command)
        then:
            thrown(NullPointerException)
    }
}
