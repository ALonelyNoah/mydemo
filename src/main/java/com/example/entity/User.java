package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String telephone;

    public User() {

    }
    public User(Integer id, String username, String password, String telephone) {

        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
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
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", telephone=" + telephone
                + "]";
    }


}
