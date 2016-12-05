package com.innovarit.hackerrank.interview.datastructures.arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    /*The editorial solution seem to be easier, just copy the array in
    2 parts first the one on the left part then the ones on the right*/

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] result = new int[a.length];
        int mod = k % n;
        for (int i = 0; i < a.length; i++) {
            int index = i + (a.length - mod);
            if (index >= a.length) {
                index = index - a.length;
            }
            result[index] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}

