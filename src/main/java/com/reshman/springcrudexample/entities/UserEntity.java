package com.reshman.springcrudexample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userRole;
    private Integer userEnabled;

    public UserEntity() {
    }

    public UserEntity(String userName, String userPassword, String userRole, Integer userEnabled) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userEnabled = userEnabled;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Integer getUserEnabled() {
        return userEnabled;
    }

    public void setUserEnabled(Integer userEnabled) {
        this.userEnabled = userEnabled;
    }
}
