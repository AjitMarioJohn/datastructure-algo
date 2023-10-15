package com.datastructure.algo.basics;

/**
 * Problem Statement: Given an integer N, write a program to count the number of digits in N.
 *
 * Example 1:
 * Input: N = 12345
 * Output: 5
 * Explanation: N has 5 digits
 *
 * Example 2:
 * Input: N = 8394
 * Output: 4
 * Explanation: N has 4 digits
 */

public class CountDigit {

    public int countDigit(int number) {
        /*
        Time Complexity:

        The time complexity of this code is O(log N), where N is the given number.
        This is because the number of iterations in the while loop is proportional to the number of digits in the number.

        Space Complexity:

        The space complexity of this code is O(1), which means constant space complexity.
        This is because the code uses a fixed amount of space to store the count and number variables, regardless of the input size.

        Please note that the actual time and space complexity may vary depending on the specific implementation and hardware used. However, in the context of big O notation, the focus is on the growth rate of the time and space complexity as the input size increases, rather than the absolute values.
         */

//        Solution - 1
//        int count = 0;
//        while (number > 0 ) {
//            count++;
//            number /= 10;
//        }
//        return count;

        /*
        Time Complexity:

            The time complexity of this code is O(log N), where N is the given number. This is because the number of iterations in the while loop is proportional to the number of digits in the number.

        Space Complexity:

            The space complexity of this code is O(1), which means constant space complexity.
            This is because the code uses a fixed amount of space to store the count and number variables, regardless of the input size.

            Please note that the actual time and space complexity may vary depending on the specific implementation and hardware used. However, in the context of big O notation, the focus is on the growth rate of the time and space complexity as the input size increases, rather than the absolute values.

            In this code, the String.valueOf(number) method converts the given number into a string. The length() method then returns the length of this string, which represents the number of digits in the given number.

            Since the length of the string is directly proportional to the number of digits in the number, the time complexity of this code is O(log N).

            The space complexity of this code is O(1) because the code uses a fixed amount of space to store the count and number variables, regardless of the input size.

            In conclusion, the time complexity of the given code is O(log N) and the space complexity is O(1).
         */
//        Solution - 2
        return String.valueOf(number).length();
    }

}
