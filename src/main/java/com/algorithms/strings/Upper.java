package com.algorithms.strings;

import com.sun.tools.javac.util.StringUtils;

import java.util.Locale;

/**
 * @author dingjuru
 * @date 2021/12/30
 */
public class Upper {
    public static void main(String[] args) {

        String s = "abcABCabc";
        System.out.println(s.toUpperCase(Locale.ROOT));

    }

    public static String toUpperCase(String s) {
        return s.toUpperCase(Locale.US);
    }
}

