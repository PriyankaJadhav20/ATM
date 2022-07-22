package com.example.UserService.NewVolume;

import com.example.UserService.Entitiy.Users;

public class ResponseTemplate {
    private Users users;
    private Details details;

    public ResponseTemplate(Users users, Details details) {
        this.users = users;
        this.details = details;
    }
    public ResponseTemplate() {
        super();
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }
}
