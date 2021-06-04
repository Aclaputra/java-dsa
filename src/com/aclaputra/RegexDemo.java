package com.aclaputra;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexDemo {
    public static void main(String[] args) {
        String re = "\\d\\d\\D";
        String text = "21y";

        Pattern pt = Pattern.compile(re);
        Matcher mt = pt.matcher(text);

        boolean result = mt.matches();
        System.out.println(result);
    }
}
