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

public class Module {
    
    private String moduleName;
    private String moduleID;
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();

    
    public Module(String moduleName, String moduleID, ArrayList students, ArrayList courses
    ){
        super();
        this.students = students;
        this.courses = courses;
        this.moduleID = moduleID;
        this.moduleName = moduleName;
    }
    
    public String getModuleName(){
        return moduleName;
    }
    
    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
    }
    
    public String getModuleID(){
        return moduleID;
    }
    
    public void setModuleID(String moduleID){
        this.moduleID = moduleID;
    }
    
    public ArrayList getStudentList(){
        return students;
    }
    
    public void setStudentList(ArrayList students){
        this.students = students;
    }
        
    public ArrayList getCourseAssociation(){
        return courses;
    }
    
    public void setCourseAssociation(ArrayList courses){
        this.courses = courses;
    }
    
    
    
    public void addCourse(String course){
        courses.add(course);
    }
    
    public void addStudent(String student){
        students.add(student);
    }
        
}
