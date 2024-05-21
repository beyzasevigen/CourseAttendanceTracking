/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseattendancetracking;

import java.util.ArrayList;

/**
 *
 * @author Beyza
 */
public class Database {

    private static ArrayList<User> users = new ArrayList();
    private static ArrayList<ClassC> classs = new ArrayList();

    public Database() {
//        classs[0] = new ClassC(1, "A1");
//        classs[1] = new ClassC(2, "B1");
//        classs[2] = new ClassC(3, "C1");
    }

    public static User loginVerification(String username, String password) {

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    

    public static ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public static ArrayList<ClassC> getClasss() {
        return classs;
    }

    public static void setClasss(ArrayList<ClassC> aClasss) {
        classs = aClasss;
    }

    

}
