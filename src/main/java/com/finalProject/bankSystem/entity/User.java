package com.finalProject.bankSystem.entity;
import com.finalProject.bankSystem.enums.SecurityAccess;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "system_user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "login")
    String login;
    @Column(name = "password")
    String password;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "account_id")
    int accountId;
    @Enumerated(value = EnumType.STRING)
    private SecurityAccess securityAccess;

    @OneToMany(mappedBy = "system_user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<DebitAccount> debitAccountList = new ArrayList<>();

    @OneToMany(mappedBy = "system_user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<CreditAccount> creditAccountList = new ArrayList<>();

    @OneToMany(mappedBy = "system_user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<MoneyTransfer> moneyTransferList = new ArrayList<>();


    public User(String login, String password, String name, String surname, int accountId, SecurityAccess securityAccess) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.accountId = accountId;
        this.securityAccess = securityAccess;
    }

    public SecurityAccess getSecurityAccess() {
        return securityAccess;
    }

    public void setSecurityAccess(SecurityAccess securityAccess) {
        this.securityAccess = securityAccess;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", accountId=" + accountId +
                ", securityAccess=" + securityAccess +
                '}';
    }
}
