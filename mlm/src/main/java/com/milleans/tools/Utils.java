package com.milleans.tools;

import com.milleans.dto.BaseJs;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.Base64Utils;

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

    public static String getEncode(String password) {
        String encode = Base64Utils.encodeToString(password.getBytes());
//        org.apache.commons.codec.binary
        return encode;
    }

    public static String getDecode(String password) {
        return Base64Utils.decodeFromString(password).toString();
    }


    public static void main(String[] args) {

        // Utils.getUserId();
        String test = "Happy";
        String endode = Utils.getEncode(test);
        System.out.println("encode=" + endode);
        System.out.println("decode=" + Utils.getDecode(endode));
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
        System.out.println("br=====>" + br);
        return br;

    }
}
