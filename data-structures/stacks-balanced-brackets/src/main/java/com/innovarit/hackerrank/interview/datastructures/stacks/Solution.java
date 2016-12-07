package com.innovarit.hackerrank.interview.datastructures.stacks;

import java.util.*;

/**
 * By luisruiz on 06/12/16.
 */

class Node {
    char val;
    Node next;

    public Node(char val) {
        this.val = val;
    }
}

class Stack {
    Node head;

    void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }

    }

    Node pop() {
        Node res = head;
        if (head != null) {
            head = head.next;
        }
        return res;
    }
}

public class Solution {

    public static boolean isBalanced(String expression) {
        Stack stack = new Stack();
        char[] charArray = expression.toCharArray();
        for (char currentChar : charArray) {
            if (currentChar == '[' || currentChar == '(' || currentChar == '{') {
                Node node = new Node(currentChar);
                stack.push(node);
            } else {
                Node popped = stack.pop();
                if (popped == null) {
                    return false;
                }
                if (currentChar == ']') {
                    if (popped.val != '[') {
                        return false;
                    }
                }
                if (currentChar == ')') {
                    if (popped.val != '(') {
                        return false;
                    }
                }
                if (currentChar == '}') {
                    if (popped.val != '{') {
                        return false;
                    }
                }
            }
        }
        if (stack.head == null) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }


}