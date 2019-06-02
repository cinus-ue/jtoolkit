package com.cinus.regexp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpUtils {


    public static boolean isEmail(String email) {
        Pattern pattern = Pattern
                .compile("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }


    public static boolean isEmail2(String data) {
        String expr = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        return data.matches(expr);

    }


    public static boolean isNumberLetter(String data) {
        String expr = "^[A-Za-z0-9]+$";
        return data.matches(expr);

    }


    public static boolean isNumber(String data) {
        String expr = "^[0-9]+$";
        return data.matches(expr);

    }


    public static boolean isLetter(String data) {

        String expr = "^[A-Za-z]+$";
        return data.matches(expr);

    }


    public static boolean isLength(String data, int length) {
        return data != null && data.length() == length;

    }
}
