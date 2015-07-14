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


}
