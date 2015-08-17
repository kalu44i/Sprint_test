package com.github.kalu44i.entity;

import javax.persistence.*;

/**
 * Created by NickVeremeichyk on 8/1/15.
 */
@Entity
@Table(name="slow_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id")
    private long id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
