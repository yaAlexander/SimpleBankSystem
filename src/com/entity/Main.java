package com.entity;

import com.servise.DepositService;
import com.servise.PaymentService;
import com.servise.TransferService;

public class Main {
    public static void main(String[] args) {
        Person alexander = new Person("Alexander", "Pushkin", "89041234567");
        Person leo = new Person("Leo", "Tolstoy", "89129876543");
        Bill billOfPushkin = new Bill(14000);
        Bill billOfTolstoy = new Bill(30000);
        Account accountOfPushkin = new Account(alexander, billOfPushkin);
        Account accountOfTolstoy = new Account(leo, billOfTolstoy);
        PaymentService paymentService = new PaymentService();
        paymentService.pay(accountOfPushkin, 3000);
        paymentService.pay(accountOfTolstoy, 1500);
        DepositService depositService = new DepositService();
        depositService.deposit(accountOfPushkin, 6000);
        depositService.deposit(accountOfTolstoy, 2500);
        TransferService transferService = new TransferService();
        transferService.transfer(accountOfPushkin, accountOfTolstoy, 3800);
    }
}
