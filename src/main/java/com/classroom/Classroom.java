package com.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private String teacherName;
    private String subject;
    private ArrayList<String> studentNames;
    private int maxClassSize = 5;

    public Classroom(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.studentNames = new ArrayList<>();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(ArrayList<String> studentNames) {
        this.studentNames = studentNames;
    }

    public boolean joinClassroom(String studentName) {
        if (studentNames.size() < maxClassSize) {
            studentNames.add(studentName);
            return true;
        } else {
            System.out.println(studentName + " was unable to join because the class is full.");
            return false;
        }
    }

    public boolean joinClassroom(String[] studentNames) {
        List<String> studentList = Arrays.asList(studentNames);
        int totalStudents = this.studentNames.size() + studentList.size();
        if (totalStudents <= maxClassSize) {
            this.studentNames.addAll(studentList);
            return true;
        } else {
            return false;
        }
    }

    public String dropOut(String studentName) {
        if (studentNames.contains(studentName)) {
            studentNames.remove(studentName);
            return studentName + " dropped out.";
        } else {
            return "Error: Student not found in the class";
        }
    }
}
