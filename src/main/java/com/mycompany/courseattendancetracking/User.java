/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseattendancetracking;

/**
 *
 * @author Beyza
 */
public class User {
    
    private String username;
    private String password;
    private String name;
    private int ıd;

    public User(String username, String password, String name, int ıd) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.ıd= ıd;
    }

    public User() {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }
    
}
