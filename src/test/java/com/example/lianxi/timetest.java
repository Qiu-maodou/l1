package com.example.lianxi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class timetest {
    public static void main(String[] args) {
        Calendar now =Calendar.getInstance();
        Date d=now.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));
    }
}
