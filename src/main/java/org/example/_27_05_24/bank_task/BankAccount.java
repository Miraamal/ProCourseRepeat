package org.example._27_05_24.bank_task;

/*
Создайте класс BankAccount со следующими свойствами:

owner (строка): имя владельца счета
balance (число с плавающей точкой): текущий баланс счета
 */
public class BankAccount {
    private final String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }


    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0.0;

    }

    public void depositAmount(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be positive");
        this.balance += amount;
    }

    public void withdrawAmount(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be positive");
        if (balance < amount) throw new IllegalArgumentException("Insufficient funds");
        this.balance -= amount;
    }


}
