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
public class tuna
{
    private String girlName;
    
    public int random(int start, int amount)    
    {
        // new variable for random number so it can be stored and returned to the object that calls it
        int randomNumber = 0;
        
        // new random object of class Random (java library) so the methonds can be used within the random object
        Random random = new Random();
        
        // randomNumber variable is assined a random number based on the numbers passed into this method from the object that called it
        randomNumber = start+random.nextInt(amount);
        
        //random number reurned to the object that called this method
        return randomNumber;
    }
    
    public String getName()
    {
        return girlName;
    }
    
    public void saying()
    {
        System.out.printf("the name of your first girlfriend: %s", getName());
    }
}
