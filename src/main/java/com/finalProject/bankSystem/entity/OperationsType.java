package com.finalProject.bankSystem.entity;


import javax.persistence.*;

@Entity
@Table(name = "operations_type")
public class OperationsType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;
    @Column(name = "operation_type")
    String operationType;

    public OperationsType(int id, String operationType) {
        this.id = id;
        this.operationType = operationType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "OperationsType{" +
                "id=" + id +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
