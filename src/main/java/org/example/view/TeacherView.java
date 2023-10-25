package org.example.view;

import org.example.data.Teacher;

import java.util.List;

public class TeacherView {
    public void displayTeachers(List<Teacher> teachers){
        for (Teacher teacher : teachers){
            System.out.println("Name: "+ teacher.getFirstName()+" "+teacher.getSecondName()+" "+teacher.getLastName()+", Subject: "+ teacher.getSubject());
        }
    }
}
