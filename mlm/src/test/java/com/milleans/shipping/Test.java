package com.milleans.shipping;

import java.text.*;

class Test {
    public static void main(String[] args) {
        float f = 125.0253f;
        DecimalFormat form = new DecimalFormat("0.00");
        System.out.println(form.format(f));
    }
}