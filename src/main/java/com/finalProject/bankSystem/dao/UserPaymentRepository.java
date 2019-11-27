package com.finalProject.bankSystem.dao;

import com.finalProject.bankSystem.entity.UserPayment;
import org.springframework.data.repository.CrudRepository;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Integer> {
}
