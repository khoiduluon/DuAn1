/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import utils.fmDate;

/**
 *
 * @author trantrung
 */
public class NewClass {

    public static void main(String[] args) {
        long d1 = new Date().getTime();
        long d2 = 180*24 * 60 * 60 * 1000;
        long d3 = d1+d2;
        System.out.println(fmDate.addDays(new Date(), 180));
        
    }

}
