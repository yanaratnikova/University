package org.example.service;
import org.example.data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<Teacher>();
    }
    public Teacher createTeacher(String firstName, String secondName, String lastName){

        Teacher teacher = new Teacher(firstName, secondName, lastName);
        teachers.add(teacher);
        return teacher;
    }

    public List<Teacher> getAllTeachers(){
        return teachers;
    }

    public void editTeacher(int teacherId, String firstName, String secondName, String lastName, String subject) {
        Teacher teacher = teachers.get(teacherId);
        teacher.setFirstName(firstName);
        teacher.setSecondName(secondName);
        teacher.setLastName(lastName);
        teacher.setTeacherId(teacherId);
        teacher.setSubject(subject);
    }
}
