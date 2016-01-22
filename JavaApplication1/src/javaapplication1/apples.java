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
             
             // create a new tuna object so you can use the object and access the methods within the class
                tuna tunaObject = new tuna();
             // instansiate variabloes for calculation
                int start = 50;
                int amountUpTo = 50; // this is how many over amount start.
                int number = 0;

                for(int counter = 1; counter <=10; counter++)
                {
                    // prints the line in the console of the random method within the tuna class accessed by the tunaObject, passing in the start number and the amountUpTo
                     System.out.println(number = tunaObject.random(start, amountUpTo));
                }
             break;
         case 2:
             
             break;
   }
    

     
    }
    
    
}
