package com.datastructure.algo.basics;

/**
 * Problem Statement: Given a number, check if it is Armstrong Number or Not.
 *
 * Example 1:
 * Input:153
 * Output: Yes, it is an Armstrong Number
 * Explanation: 1^3 + 5^3 + 3^3 = 153
 *
 * Input:170
 * Output: No, it is not an Armstrong Number
 * Explanation: 1^3 + 7^3 + 0^3 != 170
 *
 * What are Armstrong Numbers?
 *
 * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number. Examples- 0, 1, 153, 370, 371, 407, and 1634 are some of the Armstrong Numbers.
 */
public class IsArmstrongNumber {
    public boolean isArmstrongNumber(int number) {
        return solution1(number);
    }

    /*
    The time complexity of this code is O(log n), where n is the number of digits in the input number. This is because the code iterates over each digit of the number exactly once.

    The space complexity of this code is O(1), as it uses a constant amount of space to store the temporary number, the arms number, and the divisor and length constants. The space complexity does not depend on the size of the input number.

    In terms of space complexity, the recursive approach is more efficient than the iterative approach, which would have a space complexity of O(1). However, it's important to note that the actual performance of this algorithm can be significantly impacted by the specific implementation and optimizations used by the Java Virtual Machine (JVM).
     */
    private boolean solution1(int number) {
        int temp = number;
        double armsNumber = 0;
        final int divisor = 10;
        final int length = (int) Math.floor(Math.log10(number) + 1);

        while (temp > 0) {
            int digit = temp % divisor;
            armsNumber += Math.pow(digit, length);
            temp /= divisor;
        }

        return number == armsNumber;
    }
}
