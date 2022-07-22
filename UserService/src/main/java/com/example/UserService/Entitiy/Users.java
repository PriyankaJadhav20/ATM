package com.example.UserService.Entitiy;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String userPassword;

    private Long userDetailsId;


    public Users() {
        super();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
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

    public Long getUserDetailsId() {
        return userDetailsId;
    }

    public void setUserDetailsId(Long userDetailsId) {
        this.userDetailsId = userDetailsId;
    }
}
