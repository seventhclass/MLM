package com.milleans.tools;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by LeHu on 4/22/15 9:53 PM.
 */
public class Constant {

    public static String AlbumPath = "images/products/";

    public static String Uid = "uid";

    public static DecimalFormat form = new DecimalFormat("0.00");

    public static int OrderPending = 1;

    public static String TPS = "TPS";
    public static String TVQ = "TVQ";

    public static float TaxRate = (float) 0.062;

    public static int RetailerPrice = 1;
    public static int WholePrice = 0;

    public static Map<String, Integer> PriceStrategy = new HashMap<>();

    static {
        PriceStrategy.put("1", Constant.RetailerPrice);
        PriceStrategy.put("2", Constant.WholePrice);
        PriceStrategy.put("3", Constant.RetailerPrice);
        PriceStrategy.put("4", Constant.WholePrice);
    }

    public static Map<String, String> OrderStatus = new HashMap<String, String>();

    static {
        OrderStatus.put("1", "unPayment");
        OrderStatus.put("2", "unShipping");
        OrderStatus.put("3", "Finished");

    }

    public static String OrderStatusUnPayment = "1";
    public static String OrderStatusUnShipping = "2";
    public static String OrderStatusFinished = "3";


    public static String UserIdPrefix = "MV";

    public static String DataFormat = "YYMMDD";


    public static int RoleType_Admin = 1;
    public static int RoleType_Individual = 2;
    public static int RoleType_Company = 3;

    public static Map<String, Integer> RoleTypeMapVal = new HashMap<String, Integer>();

    static {
        RoleTypeMapVal.put("admin", 1);
        RoleTypeMapVal.put("individual", 2);
        RoleTypeMapVal.put("company", 3);
    }


}
