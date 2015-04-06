package com.milleans.tools;

import java.util.Calendar;

/**
 * Created by macbookpro on 2015-04-03.
 */
public class Utils {

    public static String MilleanDateFormate = "YYYY-MM-DD";


    public synchronized static String getUserId() {
        long userId = Calendar.getInstance().getTimeInMillis();
        return String.valueOf(userId);
    }


    public static void main(String[] args) {
        Utils.getUserId();
    }
}
