<<<<<<< HEAD
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

import org.joda.time.*;
import java.util.*;


public class Student {
    
    private String name;
    private int age;
    private LocalDate dob;
    private long id;
    private String username;
    private ArrayList<String> modules = new ArrayList<String>();
    
    
    public Student(String name, int age, LocalDate dob, long id,
                    String username, ArrayList modules){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = username;
        this.modules = modules;
    }
    
    public String getUsername(){
        username = name.concat(Integer.toString(age));
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public LocalDate getDOB(){
        return dob;
    }
    
    public void setDOB(LocalDate dob){
        this.dob = dob;
    }
    
    public long getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public ArrayList getModule(){
        return modules;
    }
    
    public void setModule(ArrayList modules){
        this.modules = modules;
    }
    
    
    public void addModule(String module){
        modules.add(module);
    }
   
    
}

=======
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

import org.joda.time.*;
import java.util.*;


public class Student {
    
    private String name;
    private int age;
    private LocalDate dob;
    private long id;
    private String username;
    private ArrayList<String> modules = new ArrayList<String>();
    
    
    public Student(String name, int age, LocalDate dob, long id,
                    String username, ArrayList modules){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = username;
        this.modules = modules;
    }
    
    public String getUsername(){
        username = name.concat(Integer.toString(age));
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public LocalDate getDOB(){
        return dob;
    }
    
    public void setDOB(LocalDate dob){
        this.dob = dob;
    }
    
    public long getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public ArrayList getModule(){
        return modules;
    }
    
    public void setModule(ArrayList modules){
        this.modules = modules;
    }
    
    
    public void addModule(String module){
        modules.add(module);
    }
   
    
}

>>>>>>> origin/master
