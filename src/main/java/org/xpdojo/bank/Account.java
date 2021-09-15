package org.xpdojo.bank;

public class Account {
    int balance;
    public Account(int initial) {
        balance = initial;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
