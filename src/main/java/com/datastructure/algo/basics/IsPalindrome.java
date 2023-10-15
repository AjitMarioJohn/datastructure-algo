package com.datastructure.algo.basics;

/**
 * Problem Statement:  Given a number check if it is a palindrome.
 *
 * Example 1:
 * Input: N = 123
 * Output: Not Palindrome Number
 * Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.
 *
 * Example 2:
 * Input: N =  121
 * Output: Palindrome Number
 * Explanation: 121 read backwards as 121.Since these are two same numbers 121 is a palindrome.
 */
public class IsPalindrome {
    public boolean isPalindrome(int number) {
        return solution1(number);
    }

    private boolean solution1(int number) {
        String numStr = String.valueOf(number);
        StringBuilder sb = new StringBuilder(numStr);
        return sb.reverse().toString().equals(numStr);
    }
}
