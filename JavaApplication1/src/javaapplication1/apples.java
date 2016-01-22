/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Mellor
 */
public class apples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int task = 1;
        
     switch(task){
         case 1:
                tuna tunaObject = new tuna();
                int start = 50;
                int amountUpTo = 15;
                int number = 0;

                for(int counter = 1; counter <=5; counter++)
                {
                     System.out.println(number = tunaObject.random(start, amountUpTo));
                }
             break;
         case 2:
             
             break;
   }
    

     
    }
    
    
}
