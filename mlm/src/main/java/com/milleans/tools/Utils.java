package com.milleans.tools;

import com.milleans.dto.BaseJs;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.Base64Utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by macbookpro on 2015-04-03.
 */
public class Utils {

    public static String MilleanDateFormate = "yyyy-MM-dd";

    public static String TotalFormat = "###.##";

    public static SimpleDateFormat DateFormat = new SimpleDateFormat(MilleanDateFormate);

    public static DecimalFormat decimalFormat = new DecimalFormat(TotalFormat);

    public synchronized static String getUserId() {
        long sysDate = Calendar.getInstance().getTimeInMillis();

        Date currentDate = new Date(sysDate);
        DateFormat dateFormat = new SimpleDateFormat(Constant.DataFormat);

        String userId = Constant.UserIdPrefix + dateFormat.format(currentDate) + "-" + (int) (Math.random() * 9000 + 1000);

        return userId;
    }

    public static String getEncode(String password) {
        String encode = Base64Utils.encodeToString(password.getBytes());
//        org.apache.commons.codec.binary
        return encode;
    }

    public static String getDecode(String password) {
        return Base64Utils.decodeFromString(password).toString();
    }


    public static void main(String[] args) {

//        // Utils.getUserId();
//        String test = "Happy";
//        String endode = Utils.getEncode(test);
//        System.out.println("encode=" + endode);
//        System.out.println("decode=" + Utils.getDecode(endode));
//
//
//        //
//        System.out.println(Utils.getUserId());
    }

    public static BaseJs getFailMessage(String message) {
        BaseJs baseJs = new BaseJs();
        baseJs.setMessage(message);
        baseJs.setResult("fail");
        return baseJs;
    }

    public static String getHashPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(password);

        System.out.println(hashedPassword);
        return hashedPassword;
    }

    public static boolean match(String rawPassword, String hashPwd) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        boolean br = passwordEncoder.matches(rawPassword, hashPwd);
        System.out.println("pwd is ok =====>" + br);
        return br;

    }

    public synchronized static String getOrderNumber() {
        // String order;

        long time = System.currentTimeMillis();
//        order = part + time;
        return String.valueOf(time);
    }

}
