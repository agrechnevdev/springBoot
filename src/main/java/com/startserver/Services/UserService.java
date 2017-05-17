package com.startserver.Services;


import com.startserver.Dao.UserDao;
import com.startserver.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserByLoginAndPassword(String login, String password){
        return userDao.getUserByLoginAndPassword(login, password);
    }

    public User saveNewUser(User user){
        return userDao.saveNewUser(user);
    }

}

