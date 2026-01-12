package ru.netology.accounts;

public class SimpleAccount extends Account {
    public SimpleAccount (long balance) {
        super(balance);
    }

    @Override
    public boolean add(long amount) {
        if (amount < 0) {
            return false;
        }

        this.balance += amount;

        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (this.balance < 0 || this.balance < amount) {
            return false;
        }

        this.balance -= amount;

        return true;
    }
}
