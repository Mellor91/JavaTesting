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
public class time 
{
    private int hour, minute, seconds;
    
    public void setTime(int h, int m, int s)
    {
        hour = ((h>=0 && h<24) ? h : 0);
        minute = ((m>=0 && h<60) ? m : 0);
        seconds = ((s>=0 && h<60) ? s : 0);
    }
    
    public String to24hour()
    {
        return String.format("%02d:%02d:%02d",hour, minute, seconds);
    }
    
     public String to12hour()
    {
        return String.format("%d:%02d:%02d %s",((hour == 0 || hour == 12)? 12 : hour%12), minute, seconds, (hour < 12 ? "AM" : "PM"));
    }
    
}
