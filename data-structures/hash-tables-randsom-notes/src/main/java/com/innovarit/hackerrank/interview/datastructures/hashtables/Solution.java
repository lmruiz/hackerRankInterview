package com.innovarit.hackerrank.interview.datastructures.hashtables;

import java.util.*;

/**
 * By luisruiz on 04/12/16.
 */
public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;


    public Solution(String magazine, String note) {

        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        for (String magazineWord : magazine.split(" ")) {
            Integer val = magazineMap.get(magazineWord) == null ? 0 : magazineMap.get(magazineWord);
            magazineMap.put(magazineWord, val + 1);
        }

        for (String nodeWord : note.split(" ")) {
            Integer val = noteMap.get(nodeWord) == null ? 0 : noteMap.get(nodeWord);
            noteMap.put(nodeWord, val + 1);
        }


    }

    public boolean solve() {
        for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
            Integer countMagazine = magazineMap.get(entry.getKey());
            if (countMagazine < entry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
