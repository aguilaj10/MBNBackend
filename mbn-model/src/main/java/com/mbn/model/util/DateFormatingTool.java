/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbn.model.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class DateFormatingTool {
    
    public static String dateToString(Date fecha){
        SimpleDateFormat simpleDateFormate = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String date = simpleDateFormate.format(fecha);
        return date;
    }
}
