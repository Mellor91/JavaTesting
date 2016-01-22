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
        int randomNumber = 0;
        Random random = new Random();
        
        randomNumber = start+random.nextInt(amount);

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
