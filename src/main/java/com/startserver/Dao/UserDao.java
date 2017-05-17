package com.startserver.Dao;

import com.startserver.Entity.User;
import com.startserver.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;

@Repository
public class UserDao {

    @Autowired
    private UserRepository userRepository;

    public User saveNewUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByLoginAndPassword(String login, String password) {

        for (Iterator iterator = userRepository.findAll().iterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
