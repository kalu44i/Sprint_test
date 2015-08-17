package com.github.kalu44i.dao;

import com.github.kalu44i.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by NickVeremeichyk on 8/10/15.
 */
@Component
public class UserDAO {

    @Autowired
    EntityManagerFactory entityManagerFactory;
    public UserDAO() {

    }

    public void addUser() {

    }

    public User getUserById(int id) {

        return new User();
    }

    public User getUserByName(String name) {

        return new User();
    }

    public void deleteUser(User user) {

    }

    public void modifyUser(User user) {

    }
}
