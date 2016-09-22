package co.levee.cs2.InClass

import spock.lang.Specification

/**
 * Created by Dominic Moorman on 9/21/16.
 */
class AccountTest extends Specification {
    def "Credit values -1000 to 1000"() {
        given:
        Account ac = new Account(100)

        expect:
        double start = ac.getBalance()
        assert start <= ac.credit(variables)

        where:
        variables << (-1000..1000)
    }

    def "GetBalance is working"() {
        given:
        Account ac = new Account(100);

        expect:
        ac.getBalance() == 100
    }

    def "Debit values -1000 to 1000"() {
        given:
        Account ac = new Account(100)

        expect:
        double start = ac.getBalance()
        double var = variables;
        double end = ac.debit(var)
        if(Math.abs(var) > start)
            assert end == start
        if(Math.abs(var) <= start)
            assert end <= start

        where:
        variables << (-1000..1000)
    }
}
