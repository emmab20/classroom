package com.classroom;

/**
 * Classroom
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Classroom javaClass = new Classroom("Mr. Smith", "Java");
        System.out.println("Teacher: " + javaClass.getTeacherName());
        System.out.println("Subject: " + javaClass.getSubject());

        String[] students = { "Steve Rogers", "Scott Summers", "Peter Parker", "Tony Stark" };
        javaClass.joinClassroom(students);
        System.out.println(javaClass.getStudentNames());
        System.out.println(javaClass.dropOut("Scott Summers"));
        System.out.println(javaClass.getStudentNames());
        System.out.println(javaClass.dropOut("Jacob Robert"));

        // javaClass.joinClassroom("Bill");
        // javaClass.joinClassroom("Jacob");
        // javaClass.joinClassroom("Harry");
        // javaClass.joinClassroom("Stiles");
        // javaClass.joinClassroom("Ellen");
        // javaClass.joinClassroom("Joe");
    }
}
