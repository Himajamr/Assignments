package com.Pramati;

import java.util.ArrayList;
import java.util.List;

public class Data extends Student{


    public static final List<Student> student=new ArrayList<>();
    List<Course> courses=new ArrayList<>();

    public String getStudent(){
        return student.toString();
    }
    public Data(){
        Course course1=new Course(1,"a");
        Course course2=new Course(2,"b");
        Course course3=new Course(3,"c");
        Course course4=new Course(4,"d");
        Course course5=new Course(5,"e");

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);
        courses.add(course5);

        List<Course> courseList1=new ArrayList<>();
        List<Course> courseList2=new ArrayList<>();
        List<Course> courseList3=new ArrayList<>();
        List<Course> courseList4=new ArrayList<>();
        List<Course> courseList5=new ArrayList<>();

        courseList1.add(course1); courseList1.add(course2);
        courseList2.add(course2); courseList2.add(course3);
        courseList3.add(course3); courseList3.add(course4);
        courseList4.add(course4); courseList4.add(course5);
        courseList5.add(course5); courseList5.add(course1);

        Student student1=new Student(1,"a","a1","admin",(ArrayList)courseList1);
        Student student2=new Student(2,"b","b1","admin",(ArrayList)courseList2);
        Student student3=new Student(3,"c","c1","admin",(ArrayList)courseList3);
        Student student4=new Student(4,"d","d1","admin",(ArrayList)courseList4);
        Student student5=new Student(5,"e","e1","admin",(ArrayList)courseList5);
    }
    public String getStudentDataById(){
        for(int i=0;i<student.size();i++){
            if(student.get(i).studentId==2){
                return student.get(i).toString();
            }
        }
        return "Not found";
    }
    public boolean deleteStudentDataById(){
        for(int i=0;i<student.size();i++){
            if(student.get(i).studentId==2){
                student.remove(student.get(i));
                return true;
            }
        }
        return false;
    }
    }
