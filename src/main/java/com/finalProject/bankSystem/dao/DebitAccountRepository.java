package com.finalProject.bankSystem.dao;

import com.finalProject.bankSystem.entity.DebitAccount;
import org.springframework.data.repository.CrudRepository;

public interface DebitAccountRepository extends CrudRepository<DebitAccount, Integer> {
}
