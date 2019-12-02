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

import java.util.*;
import java.lang.*;
import org.joda.time.*;


public class CourseProgramme {
    
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> modules = new ArrayList<>();
    private LocalDate startDate;
    private LocalDate endDate;
    
    
    public CourseProgramme(String courseName, ArrayList modules, ArrayList students,
                           LocalDate startDate, LocalDate endDate){
        this.modules = modules;
        this.students = students;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    public List getModule(){
        return modules;
    }
    
    public void setModule(ArrayList modules){
        this.modules = modules;
    }
    
    public ArrayList getStudents(){
        return students;
    }
    
    public void setStudents(ArrayList students){
        this.students = students;
    }
    
    public LocalDate getStartDate(){
        return startDate;
    }
    
    public void setStartDate(LocalDate startDate){
        this.startDate = startDate;
    }
    
    public LocalDate getEndDate(){
        return endDate;
    }
    
    public void setEndDate(LocalDate endDate){
        this.endDate = endDate;
    }
    
    
    public void addModule(String module){
        modules.add(module);
    }
    
}
