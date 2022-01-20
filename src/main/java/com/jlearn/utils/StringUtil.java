package com.jlearn.utils;


import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author dingjuru
 * @date 2022/1/11
 */
public class StringUtil {

    public static void main(String[] args) {

        String str = "a";
        System.out.println(str);
        System.out.println(StringUtil.humpToLine(str));
    }


    public static String humpToLine(String str) {

        str.replaceFirst("[a-z]", "fff");
        System.out.println(str);
        return str.replaceAll("[A-Z]", "_$0").toLowerCase(Locale.ROOT);
    }

    public static String humpToLine2(String str) {
        Pattern compile = Pattern.compile("[A-Z]");

        Matcher matcher = compile.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

}
