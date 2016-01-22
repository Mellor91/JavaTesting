/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

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
             // instansiate variabloes for calculation
                int min;
                int max; // this is how many over amount start.
                int number = 0;
                int preValidation;
                int numberOfRandom;

             // create a new tuna object so you can use the object and access the methods within the class
                tuna tunaObject = new tuna();
                Scanner scanStart = new Scanner(System.in);
                Scanner scanEnd = new Scanner(System.in);
                Scanner scanAmount = new Scanner(System.in);
                
             // the users first input is in the start variable, 
                System.out.println("You have entered the random number generator!");   
                System.out.println("Please enter the number you wish your random number generator start point to be at:");   
                min = scanStart.nextInt();
                System.out.println("Please enter the number you wish your random number generator end point to end at:"); 
                
             // the second input is set to the amountUpTo variable, and validates that the number is greater than the start variable
                
                preValidation = scanEnd.nextInt();
                while(preValidation <= min)
                {
                    System.out.println("Incoorect value, number must be above start value."); 
                    System.out.println("Please enter the number you wish your random number generator end point to end at:");
                // makes the calculation of when to end the max limit of the random number generator
                    preValidation = scanEnd.nextInt();
                }
                max = preValidation - min + 1;
                
                
             //the amount of random numbers in the numberOfRandom variable.
                System.out.println("Please enter the amount of random numbers you wish to be generated:");   
                numberOfRandom = scanAmount.nextInt();
             
                System.out.println("your random numbers are: ");
                for(int counter = 1; counter <= numberOfRandom; counter++)
                {
                    // prints the line in the console of the random method within the tuna class accessed by the tunaObject, passing in the start number and the amountUpTo
                     System.out.println(number = tunaObject.random(min, max));
                }
             break;
             
             
             
             
         case 2:
             
             break;
   }
    

     
    }
    
    
}
