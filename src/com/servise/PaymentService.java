package com.servise;

import com.entity.Account;
import com.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Недостаточно средств");
        } else {
            System.out.println("Происходит операция платежа с аккаунта: " + account.getAccountHolder().getSurName());
            System.out.println("Текущее значение счёта: " + bill.getAmount());
            bill.setAmount(bill.getAmount() - amount);
            System.out.println("Платеж завершен, текущее значение счёта: " + bill.getAmount() + "\n");
        }
    }
}
