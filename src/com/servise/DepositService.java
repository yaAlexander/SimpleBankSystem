package com.servise;

import com.entity.Account;
import com.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        System.out.println("Происходит операция зачисления средств на аккаунт: " + account.getAccountHolder().getSurName());
        System.out.println("Текущее значение счёта: " + bill.getAmount());
        bill.setAmount(bill.getAmount() + amount);
        System.out.println("Зачисление завершено, текущее значение счёта: " + bill.getAmount() + "\n");
    }
}
