package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateTime {
    public static String createTime(){
        Date currentTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateString = format.format(currentTime);
        return dateString;
    }
}
