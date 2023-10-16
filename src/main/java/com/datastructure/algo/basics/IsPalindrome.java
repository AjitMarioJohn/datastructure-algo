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

    /*
    The time complexity of the code is O(log n), where n is the input number. This is because the StringBuilder's reverse() method iterates over each character in the string once. Since the number of characters in the string is proportional to the number of digits in the input number, the time complexity is O(log n).

    The space complexity of the code is also O(log n), where n is the input number. This is because the StringBuilder's capacity is proportional to the number of digits in the input number. The space complexity is determined by the amount of memory allocated to store the characters in the StringBuilder. Since the number of characters is proportional to the number of digits in the input number, the space complexity is O(log n).

    In terms of optimization, the code is already efficient as it uses a StringBuilder, which is a mutable sequence of characters. The time complexity of O(log n) is the best possible time complexity for this problem, as we have to process each digit in the input number once. The space complexity of O(log n) is also optimal, as we need to store each digit in the input number.
     */
    private boolean solution1(int number) {
        String numStr = String.valueOf(number);
        StringBuilder sb = new StringBuilder(numStr);
        return sb.reverse().toString().equals(numStr);
    }
}
