package Entities;

import Exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Account(){}

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(Double amount) {
        if (amount <= 0) {
            throw new DomainException("Deposit error: Amount must be positive");
        }
        balance += amount;
    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            throw new DomainException("Withdrawal error: Amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new DomainException("Withdrawal error: Not enough balance");
        }
        if (balance <= 0){
            throw new DomainException("Withdrawal error: Balance negative");
        }
        balance -= amount;
    }
}
