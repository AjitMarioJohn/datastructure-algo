package com.datastructure.algo.basics;

/**
 * Problem Statement: Given a number N reverse the number and print it.
 *
 * Example 1:
 * Input: N = 123
 * Output: 321
 * Explanation: The reverse of 123 is 321
 *
 * Example 2:
 * Input: N = 234
 * Output: 432
 * Explanation: The reverse of 234 is 432
 */
public class ReverseNumber {


    public int reverseNumber(int number) {
        return solution2(number);
    }

    /*
   The time complexity of the code is O(log n), where n is the input number. This is because the number of iterations in the while loop is proportional to the number of digits in the input number.

   The space complexity of the code is O(1), which means the space complexity is constant. This is because the amount of space used by the code does not change with the size of the input number. The variables `divisor`, `reverseNumber`, and `number` all use a constant amount of space.

   Here's a step-by-step explanation of the time complexity:

   1. The code divides the input number by 10 in each iteration of the while loop.
   2. Since the number of digits in the input number is logarithmic with respect to the number itself, the number of iterations in the while loop is also logarithmic with respect to the number.
   3. Therefore, the time complexity of the code is O(log n).

   And here's a step-by-step explanation of the space complexity:

   1. The code uses a constant number of variables, regardless of the size of the input number.
   2. Therefore, the amount of space used by the code is constant, and the space complexity is O(1).
    */
    private int solution1(int number) {
        final int divisor = 10;
        int reverseNumber = 0;

        while (number > 0) {
            int lastDigit = number%divisor;
            reverseNumber = reverseNumber*10+lastDigit;
            number /= divisor;
        }

        return reverseNumber;
    }

    /*
    The time complexity of the code is O(log n), where n is the input number. This is because the StringBuilder's reverse() method iterates over each character in the string once. Since the number of characters in the string is proportional to the number of digits in the input number, the time complexity is O(log n).

    The space complexity of the code is also O(log n), where n is the input number. This is because the StringBuilder's capacity is proportional to the number of digits in the input number. The space complexity is determined by the amount of memory allocated to store the characters in the StringBuilder. Since the number of characters is proportional to the number of digits in the input number, the space complexity is O(log n).

    In terms of optimization, the code is already efficient as it uses a StringBuilder, which is a mutable sequence of characters. The time complexity of O(log n) is the best possible time complexity for this problem, as we have to process each digit in the input number once. The space complexity of O(log n) is also optimal, as we need to store each digit in the input number.
     */
    private int solution2(int number) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(number));
        String reverseNumberString = stringBuilder.reverse().toString();
        if (reverseNumberString.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(reverseNumberString);
    }
}
