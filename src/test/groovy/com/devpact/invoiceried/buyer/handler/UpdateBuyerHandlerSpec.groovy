package com.devpact.invoiceried.buyer.handler

import com.devpact.invoiceried.buyer.domain.Buyer
import com.devpact.invoiceried.buyer.domain.BuyerRepository
import com.devpact.invoiceried.buyer.domain.command.UpdateBuyer
import spock.lang.Specification

class UpdateBuyerHandlerSpec extends Specification {
    def repository = Mock(BuyerRepository)

    def "when buyer is updatec succesfully then should return updated version of buyer"() {
        given:
            def buyerId = UUID.randomUUID()
            def buyer = new Buyer(buyerId, "AC", null, null)
            repository.find(buyerId) >> Optional.of(buyer)
            def command = UpdateBuyer.builder()
                    .id(buyerId.toString())
                    .companyName("ACME")
                    .build()

            def handler = new UpdateBuyerHandler(repository)
        when:
            def result = handler.handle(command)
        then:
            result.getBuyer().getId() == buyerId
            result.getBuyer().companyName == "ACME"
    }
}
