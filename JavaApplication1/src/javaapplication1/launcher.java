/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Mellor
 */
public class launcher 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     int task = 1;
        
     switch(task)
        {
            case 1:
              randomNumberGenorator();
                break;

            case 2:
              compoundInterestCalculator();
                break;

            case 3:
              basicArrayTable();
                break;

            case 4:
              fibonacciSequence();
                break;

            case 5:
              int firstArray[][] = {{9,8,7,6,5,4,3,2,1},{5,6,4,7,3,8,2,9,1,0}};
              int secondArray[][] = {{3,4,5,6},{2,32,9,1,0},{4,654,82345}};
              System.out.println("You have entered the multidimentional array table:"); 
              System.out.println("This is the first array:");
              multiDimentionalArrayTable(firstArray);
              System.out.println("This is the Second array:");
              multiDimentionalArrayTable(secondArray);
                break;    
                
            case 6:
                System.out.println(average(1,2,3,4,5,6,7,8,9));
                break;
                
            case 7:
                time();
                break;
        }
    }  
    
    
    public static void randomNumberGenorator()
    {
        randomNumberGenerator RNDObj = new randomNumberGenerator();  
        
        RNDObj.randomNumber();
    }
    
    public static void compoundInterestCalculator()
    {
        double amount, principle, rate, days;

        Scanner principleScanner = new Scanner(System.in);
        Scanner rateScanner = new Scanner(System.in);
        Scanner daysScanner = new Scanner(System.in);

        System.out.println("You have entered the compound interest calculator:");   
        System.out.println("Please enter the amount you will start at:");
        principle = principleScanner.nextDouble();

        System.out.println("Please enter growth percentage per day:");
        rate = rateScanner.nextDouble();

        System.out.println("Please enter the amount of days you calculate for:");
        days = daysScanner.nextDouble();

        System.out.println("Your compound interest:");
        for(int counter = 1;counter<=days;counter++)
        {
            amount = principle*Math.pow(1 + rate,counter);
            System.out.println("Your total for day " + counter + " = " + amount);
        }
    }
    
    public static void basicArrayTable()
    {
        int arraySum = 0;

        System.out.println("Your array table is:"); 
        int array[] = {12,23,34,45,56,67,78,89,121,232,343,454,565,676,787,898,909};
        System.out.println("Index\tValue");

        for (int counter=0;counter<array.length;counter++)
        {
            arraySum += array[counter];
            System.out.println(counter + "\t" + array[counter]);
        }
        System.out.println("The total of the array = " + arraySum);
    }
    
    
    
    public static void fibonacciSequence()
    {
        int preValid, fibAmount, first = 0, second = 1, index = 2;
        Scanner scanFibAmount = new Scanner(System.in);
        System.out.println("You have entered the fibonacci sequesnce:"); 
        System.out.println("Please enter the amount of numbers you wish to go up to:"); 

        preValid = scanFibAmount.nextInt();
        while(preValid<=2)
        {
            System.out.println("You must have at least 2 numbers in your fibonacci sequence:"); 
            preValid = scanFibAmount.nextInt();
        }

        fibAmount = preValid;
        int sequence[] = new int[fibAmount];
        System.out.println("Your fibonacci sqquence is: ");
        sequence[0] = 0;
        sequence[1] = 1;
        System.out.println(sequence[0]);
        System.out.println(sequence[1]);


        for(int counter = 2; counter<sequence.length; counter++)
        {
            sequence[index] = sequence[first] + sequence[second];
            System.out.println(sequence[index]);
            first++;
            second++;
            index++;
        }
    }
    
    public static void multiDimentionalArrayTable(int array[][])
    {
        for (int row = 0; row<array.length; row++)
        {
            for (int column = 0; column<array[row].length; column++)
            {
                System.out.print(array[row][column]+"\t");
            }
            System.out.println();
        }
    }
    
    public static int average(int...numbers)
    {
        int total = 0;
        for(int x:numbers)
        {
            total+=x;
        }
        return total/numbers.length;
    }
    
    public static void time()
    {
        time timeObject = new time();
        
        timeObject.setTime(9, 27, 6);
        System.out.println(timeObject.to24hour());
        System.out.println(timeObject.to12hour());
    }
}
