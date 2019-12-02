package main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Caoimhe
 */
import org.junit.*;
import org.joda.time.*;
import java.util.*;

public class main {
    
    @Test
    public static void main(String[] args){
        ArrayList<String> modules = new ArrayList<>();
        modules.add("CT4101");
        
        Student s1 = new Student("Caoimhe Keogh", 21, new LocalDate(1998,4,28), 16349276, null, modules);
        Module m1 = new Module("Software Engineering 3", "CT417", null, null);
        CourseProgramme c1 = new CourseProgramme("4BCT", null, null, new LocalDate(2016,9,11), new LocalDate(2020,5,12));
        
        
        System.out.println("Student name: " + s1.getName());
        System.out.println("Student age: " + s1.getAge());
        System.out.println("Student Date of Birth: " + s1.getDOB());
        System.out.println("Student ID: " + s1.getID());
        System.out.println("Student username is: " + s1.getUsername());
        s1.addModule("CT417");
        System.out.println("Student module: " + s1.getModule());
        System.out.println("\n\n");
        
        System.out.println("Module name: " + m1.getModuleName());
        System.out.println("Module ID: " + m1.getModuleID());
        System.out.println("Students enrolled in module: " + m1.getStudentList());
        System.out.println("Courses module is associated with: " + m1.getCourseAssociation());
        System.out.println("\n\n");
        
        System.out.println("Course name: " + c1.getCourseName());
        System.out.println("Modules in course: " + c1.getModule());
        System.out.println("Students enrolled: " + c1.getStudents());
        System.out.println("Date started: " + c1.getStartDate());
        System.out.println("Date finished: " + c1.getEndDate());
        System.out.println("\n");
    }
    
}
