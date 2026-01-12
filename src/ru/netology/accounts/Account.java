package ru.netology.accounts;

public abstract class Account {
    protected long balance;

    public Account (long balance) {
        this.balance = balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                this.add(amount);
            }
        }

        return false;
    }

    public long getBalance() {
        return this.balance;
    };
}
