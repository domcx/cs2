package co.levee.cs2.InClass;

/**
 * Created by Dominic Moorman on 9/8/16.
 */
public class Account {
    // instance variable stores balance
    private double balance;

    // constructor
    public Account(double initialBalance) {
        // validate that initialBalance is greater than 0.0;
        // if not, balance is initialized to default value 0.0
        if (initialBalance > 0)
            balance = initialBalance;
        else
            balance = 0;
    } // end Account constructor

    // credit (add) an amount to the account
    public double credit(double amount) {
        amount = Math.abs(amount);
        return balance += amount; // add amount to balance
    } // end method credit

    // return the account balance
    public double getBalance() {
        return balance; // value balance to calling method
    }

    public double debit(double d) {
        d = Math.abs(d);
        if (balance >= d)
            return balance -= d;
        return balance;
    }
} // end class Account

