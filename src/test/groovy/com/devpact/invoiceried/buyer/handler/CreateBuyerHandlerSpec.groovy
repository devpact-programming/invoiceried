package com.devpact.invoiceried.buyer.handler

import com.devpact.invoiceried.buyer.domain.BuyerRepository
import com.devpact.invoiceried.buyer.domain.command.CreateBuyer
import spock.lang.Specification

class CreateBuyerHandlerSpec extends Specification {
    def repository = Mock(BuyerRepository)

    def "should return id for new buyer"() {
        given:
            def command = CreateBuyer.builder().build()
            def handler = new CreateBuyerHandler(repository);
        when:
            def result = handler.handle(command)
        then:
            result.getId() != null
    }

    def "should save new buyer with success"() {
        given:
            def command = CreateBuyer.builder().build()
            def handler = new CreateBuyerHandler(repository);
        when:
            handler.handle(command)
        then:
            1* repository.save(_)
    }
}
