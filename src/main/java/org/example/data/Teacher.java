package org.example.data;

public class Teacher extends User{
    protected int teacherId;
    protected String subject;

    public Teacher(String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                '}';
    }
}
