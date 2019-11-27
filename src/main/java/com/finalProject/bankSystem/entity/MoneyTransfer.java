package com.finalProject.bankSystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "money_transfer")
public class MoneyTransfer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "user_id")
    int userId;
    @Column(name = "transferred_sum")
    int transferredSum;
    @Column(name = "operation_time")
    String operationTime;
    @Column(name = "operation_type_id")
    int operationTypeId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public MoneyTransfer(int id, int userId, int transferredSum,
                         String operationTime, int operationTypeId) {
        this.id = id;
        this.userId = userId;
        this.transferredSum = transferredSum;
        this.operationTime = operationTime;
        this.operationTypeId = operationTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTransferredSum() {
        return transferredSum;
    }

    public void setTransferredSum(int transferredSum) {
        this.transferredSum = transferredSum;
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public int getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(int operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    @Override
    public String toString() {
        return "MoneyTransfer{" +
                "id=" + id +
                ", userId=" + userId +
                ", transferredSum=" + transferredSum +
                ", operationTime='" + operationTime + '\'' +
                ", operationTypeId=" + operationTypeId +
                '}';
    }
}
