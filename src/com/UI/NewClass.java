/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

/**
 *
 * @author trantrung
 */
public class NewClass {
    public static void main(String[] args) {
  
       
    }
    
        int getSumDays(int numberOfMonths, int month, int year) {
        int sumDays = 0;
        for (int i = 0; i < numberOfMonths; i++) {
            if (month == 2) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
                    sumDays += 29;
                 else 
                    sumDays += 28;
                
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                    || month == 10 || month == 12) 
                    sumDays += 31;
            else 
                sumDays += 30;
        }
        return sumDays;
    }
}
