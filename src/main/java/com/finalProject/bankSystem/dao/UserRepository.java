package com.finalProject.bankSystem.dao;

import com.finalProject.bankSystem.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
