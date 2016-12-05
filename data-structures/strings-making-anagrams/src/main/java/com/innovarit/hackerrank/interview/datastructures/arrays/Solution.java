package com.innovarit.hackerrank.interview.datastructures.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * By luisruiz on 04/12/16.
 */
public class Solution {

    /**
     * The editorial suggest making 2 tables and store how many times each char appears in every word
     * then compare both tables to know how many delete
     *
     */

    public static int numberNeeded(String first, String second) {
        StringBuilder sbSecond = new StringBuilder(second);

        int total = first.length() + second.length();
        int pairs = 0;
        for (char c : first.toCharArray()) {
            int index = sbSecond.indexOf(String.valueOf(c));
            if (index >= 0) {
                sbSecond.deleteCharAt(index);
                pairs += 2;
            }
        }
        return total - pairs;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
