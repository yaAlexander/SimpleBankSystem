package com.servise;

import com.entity.Account;
import com.entity.Bill;

public class TransferService {
    public void transfer(Account accountTo, Account accountFrom, int amount) {
        Bill bill1 = accountTo.getBill();
        Bill bill2 = accountFrom.getBill();
        if (bill2.getAmount() < amount) {
            System.out.println("Перевод не возможен. Недостаточно средств");
        } else {
            System.out.println("Происходит перечисление средств");
            bill1.setAmount(bill1.getAmount() + amount);
            bill2.setAmount(bill2.getAmount() - amount);
            System.out.println("Перечисление успешно завершено");
            System.out.println("Текущее значение счёта: " + accountTo.getAccountHolder().getSurName() + " " + bill1.getAmount());
            System.out.println("Текущее значение счёта: " + accountFrom.getAccountHolder().getSurName() + " " + bill2.getAmount());
        }
    }
}
