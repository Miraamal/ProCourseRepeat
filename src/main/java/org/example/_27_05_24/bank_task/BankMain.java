package org.example._27_05_24.bank_task;

/*
Создайте класс BankAccount со следующими свойствами:

owner (строка): имя владельца счета
balance (число с плавающей точкой): текущий баланс счета
 */
public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("George");


        System.out.println(bankAccount.getBalance());

        bankAccount.depositAmount(200);
        System.out.println(bankAccount.getBalance());

        bankAccount.withdrawAmount(150);
        System.out.println(bankAccount.getBalance());

        bankAccount.withdrawAmount(150);


    }
}
