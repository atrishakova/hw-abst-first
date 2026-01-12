package ru.netology.accounts;

public class CreditAccount extends Account{
    private final long creditLimit;

    public CreditAccount (long balance, long creditLimit) {
        super(balance);

        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount < 0) {
            return false;
        }

        long newBalance = balance + amount;
        if (newBalance > 0) {
            return false;
        }

        this.balance = newBalance;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (amount < 0) {
            return false;
        }

        long newBalance = balance - amount;
        if (newBalance < -this.creditLimit) {
            return false;
        }

        this.balance = newBalance;
        return true;
    }
}
