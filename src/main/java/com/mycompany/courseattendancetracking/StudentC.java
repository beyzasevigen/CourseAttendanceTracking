/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseattendancetracking;

/**
 *
 * @author Beyza
 */
public class StudentC extends User {

    private ClassC classs;

    public StudentC(String username, String password, String name, int ıd, ClassC classs) {
        super(username, password, name, ıd);
        this.classs=classs;
    }

    public StudentC() {

    }

    public ClassC getClasss() {
        return classs;
    }

    public void setClasss(ClassC classs) {
        this.classs = classs;
    }

}
