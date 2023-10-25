package org.example.view;

import org.example.data.Student;

import java.util.List;

public class StudentView implements UserView<Student>{

    @Override
    public void sendOnconsole(List<Student> list) {
        for (Student student : list){
            System.out.println(student);
        }
    }
}
