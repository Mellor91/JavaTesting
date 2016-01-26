/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Mellor
 */
public class overloadedConstructors {
    
    private int hour, minute, seconds;
    
    public overloadedConstructors()
    {
        this(0,0,0);
    }
    
    public overloadedConstructors(int h)
    {
        this(h,0,0);
    }
    
    public overloadedConstructors(int h, int m)
    {
        this(h,m,0);
    }
    
    public overloadedConstructors(int h, int m, int s)
    {
        setTime(h,m,s);
    }
    
    public void setTime(int h, int m, int s)
    {
        //setHour(h);
        //setMinute(m);
        //setSenconds(s);
    }
}
