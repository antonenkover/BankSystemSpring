package com.finalProject.bankSystem.services;

import com.finalProject.bankSystem.dao.UserRepository;
import com.finalProject.bankSystem.entity.User;
import com.finalProject.bankSystem.enums.SecurityAccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class ValidationService {
    private static final Logger LOG = LoggerFactory.getLogger(ValidationService.class);
    @Resource
    private UserRepository userRepository;
    @Resource
    private ValidationService validationService;


    public Optional<User> validateUser(String login, String password) {
        List<User> all = (List<User>) userRepository.findAll();
        return all.stream()
                .filter(u -> u.getLogin().equals(login)
                        && u.getPassword().equals(password))
                .findFirst();
    }

    public boolean validateLogin(String login) {
        List<User> users = (List<User>) userRepository.findAll();
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                LOG.debug("Login not validated: " + user.getLogin());
                return false;
            }
        }
        return true;
    }

    public boolean isExist(String login) {
        List<User> all = (List<User>) userRepository.findAll();
        return all.stream()
                .anyMatch(u -> u.getLogin().equals(login));
    }

    public User registrationUser(String login, String password, String name, String surname) {
        Random random = new Random();
        int accountId = random.nextInt(900) + 100;
        User newUser = new User(login, password, name, surname, accountId, SecurityAccess.USER);
        return userRepository.save(newUser);
    }
}
