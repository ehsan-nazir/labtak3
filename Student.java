/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author sp17-bse-033
 */
public class Student {
    protected final static int NUM_OF_TEST=3;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    
    
    public void student(){
        
    } 
    public void student(String studentname){
        name=studentname;
        test=new int[NUM_OF_TEST] ;
        courseGrade="***";
    }
    public String getCourseGrade(){
       
        return courseGrade;
    }
    public String getName(){
        return name;
    }        
    
    public int getTestScore(int testnumber){
       return test[testnumber-1];
    }
     
    public void setName(String newname){
        name=newname;
    }
            
    public void setTestScore(int testnumber,int testscore){
        test[testnumber-1]=testscore;
        
    }
}
