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
public class ClassC {

    private static ArrayList<StudentC> students = new ArrayList();
    private String className;
    private int ıd;

    public ClassC(int ıd, String className) {
        this.ıd = ıd;
        this.className = className;
    }

    public ClassC() {
    }

    public void addStudentToClass(StudentC student) {
        this.students.add(student); // Add the student to the list of students in the class
        student.setClasss(this); // Set the class for the student
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public static ArrayList<StudentC> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<StudentC> students) {
        this.students = students;
    }
}
