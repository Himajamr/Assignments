package com.Pramati;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student extends Course {
    static HashMap<String,List> hashMap=new HashMap<>();
    int studentId;
    String studentName;
    String userName;
    String password;
    ArrayList<Course> courses=new ArrayList<>();

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    Student(){}

    public Student(int studentId,String studentName, String userName, String password, ArrayList courses){
        super();
        this.studentId=studentId;
        this.studentName=studentName;
        this.userName=userName;
        this.password=password;
        this.courses=courses;
    }



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", courses=" + courses +
                '}';
    }
}
