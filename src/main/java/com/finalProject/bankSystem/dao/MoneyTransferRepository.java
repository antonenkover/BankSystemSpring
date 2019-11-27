package com.finalProject.bankSystem.dao;

import com.finalProject.bankSystem.entity.MoneyTransfer;
import org.springframework.data.repository.CrudRepository;

public interface MoneyTransferRepository extends CrudRepository<MoneyTransfer, Integer> {
}
