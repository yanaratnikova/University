package org.example.controler;

import org.example.data.Student;
import org.example.data.Teacher;
import org.example.service.TeacherService;
import org.example.view.TeacherView;

import java.util.List;

public class TeacherController implements UserControler<Teacher>{
    private TeacherService teacherService;
    private TeacherView teacherView;
    public TeacherController(){
        teacherService = new TeacherService();
        teacherView = new TeacherView();
    }


    @Override
    public Teacher create(String firstName, String secondName, String lastName) {
        return teacherService.createTeacher(firstName, secondName, lastName);
    }
    public void editTeacher(int teacherId, String firstName, String secondName, String lastName, String subject){
        teacherService.editTeacher(teacherId, firstName, secondName, lastName, subject);
    }
    public void displayAllTeachers(){
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.displayTeachers(teachers);
    }
}

