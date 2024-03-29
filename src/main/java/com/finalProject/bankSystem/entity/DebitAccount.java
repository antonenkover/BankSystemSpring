package com.finalProject.bankSystem.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "debit_account")
public class DebitAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "balance")
    int balance;
    @Column(name = "debit_rate")
    int debitRate;
    @Column(name = "deposited_sum")
    int depositedSum;
    @Column(name = "deposit_start")
    String depositStart;
    @Column(name = "deposit_end")
    String depositEnd;
    @Column(name = "deposit_duration")
    int depositDuration;
    @Column(name = "account_id")
    int accountId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private User user;

    public DebitAccount(int id, int balance, int debitRate, int depositedSum,
                        String depositStart, String depositEnd,
                        int depositDuration, int accountId) {
        this.id = id;
        this.balance = balance;
        this.debitRate = debitRate;
        this.depositedSum = depositedSum;
        this.depositStart = depositStart;
        this.depositEnd = depositEnd;
        this.depositDuration = depositDuration;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDebitRate() {
        return debitRate;
    }

    public void setDebitRate(int debitRate) {
        this.debitRate = debitRate;
    }

    public int getDepositedSum() {
        return depositedSum;
    }

    public void setDepositedSum(int depositedSum) {
        this.depositedSum = depositedSum;
    }

    public String getDepositStart() {
        return depositStart;
    }

    public void setDepositStart(String depositStart) {
        this.depositStart = depositStart;
    }

    public String getDepositEnd() {
        return depositEnd;
    }

    public void setDepositEnd(String depositEnd) {
        this.depositEnd = depositEnd;
    }

    public int getDepositDuration() {
        return depositDuration;
    }

    public void setDepositDuration(int depositDuration) {
        this.depositDuration = depositDuration;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", debitRate=" + debitRate +
                ", depositedSum=" + depositedSum +
                ", depositStart='" + depositStart + '\'' +
                ", depositEnd='" + depositEnd + '\'' +
                ", depositDuration=" + depositDuration +
                ", accountId=" + accountId +
                '}';
    }
}
