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
public class Undergraduate extends Student{
    public void computecoursegrade(){
        int total=0;
        for(int i=0;i<NUM_OF_TEST;i++){
            total+=test[i];
            }
    if (total/NUM_OF_TEST>=50){
        System.out.println("student is pass");
    }
    else{
        System.out.println("student is not pass");
    }
    }
}
