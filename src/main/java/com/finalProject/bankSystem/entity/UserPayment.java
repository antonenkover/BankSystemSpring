package com.finalProject.bankSystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "user_payment")
public class UserPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "receiver_id")
    int receiverId;
    @Column(name = "operation_type_id")
    int operationTypeId;
    @Column(name = "operation_id")
    int operationId;

    public UserPayment(int id, int receiverId, int operationTypeId, int operationId) {
        this.id = id;
        this.receiverId = receiverId;
        this.operationTypeId = operationTypeId;
        this.operationId = operationId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public int getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(int operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    @Override
    public String toString() {
        return "UserPayment{" +
                "id=" + id +
                ", receiverId=" + receiverId +
                ", operationTypeId=" + operationTypeId +
                ", operationId=" + operationId +
                '}';
    }
}
