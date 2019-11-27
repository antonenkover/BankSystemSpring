package com.finalProject.bankSystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "title")
    String title;
    @Column(name = "account_id")
    int accountId;

    public Services(int id, String title, int accountId) {
        this.id = id;
        this.title = title;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", accountId=" + accountId +
                '}';
    }
}
