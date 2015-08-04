package com.milleans.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeHu on 4/22/15 9:53 PM.
 */
public class Constant {

    public static String AlbumPath = "images/products/";

    public static String Uid = "uid";

    public static int OrderPending = 1;

    public static String TPS = "TPS";
    public static String TVQ = "TVQ";

    public static Map<String, String> OrderStatus =
            new HashMap<String, String>();

    {
        OrderStatus.put("1", "Pending");
        OrderStatus.put("2", "UnPayment");
        OrderStatus.put("3", "Finished");
    }

    public static String UserIdPrefix = "MV";

    public static String DataFormat = "YYMMDD";


    public static int RoleType_Admin = 1;
    public static int RoleType_Individual = 2;
    public static int RoleType_Company = 3;

    public final static Map<String, Integer> RoleTypeMapVal = new HashMap<>();

    {
        RoleTypeMapVal.put("admin", 1);
        RoleTypeMapVal.put("individual", 2);
        RoleTypeMapVal.put("company", 3);
    }

}
