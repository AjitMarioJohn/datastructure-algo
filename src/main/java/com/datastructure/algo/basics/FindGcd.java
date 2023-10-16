package com.datastructure.algo.basics;

/**
 * Problem Statement: Find the gcd of two numbers.
 *
 * Example 1:
 * Input: num1 = 4, num2 = 8
 * Output: 4
 * Explanation: Since 4 is the greatest number which divides both num1 and num2.
 *
 * Example 2:
 * Input: num1 = 3, num2 = 6
 * Output: 3
 * Explanation: Since 3 is the greatest number which divides both num1 and num2.
 */
public class FindGcd {
    public int findGcd(int num1, int num2) {
        return gcd(num1, num2);
    }

    /*
    The given code calculates the Greatest Common Divisor (GCD) of two numbers.

    Time Complexity: The time complexity of this code is O(n), where n is the smaller number between num1 and num2. This is because the code iterates from 1 to n, checking if each number is a common divisor.

    Space Complexity: The space complexity of this code is O(1), which means the space required does not change with the size of the input, as it uses a constant amount of space to store the variables iterateTill, gcd, and index.
     */
    private int solution1(int num1, int num2) {
        final int iterateTill = Math.min(num1, num2);
        int gcd = 0;
        for (int index = 1; index <= iterateTill; index++) {
            if (num1%index == 0 && num1%index == 0) {
                gcd = index;
            }
        }
        return gcd;
    }

    /*
    Intuition: Gcd is the greatest number which is divided by both a and b.If a number is divided by both a and b, it is should be divided by (a-b) and b as well.
    gcd(a,b) = gcd(b,a%b)

    The given code calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean Algorithm.

    The Euclidean Algorithm is a method for computing the greatest common divisor of two numbers: the largest number that divides both of them without leaving a remainder.

    The algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number.

    The time complexity of this algorithm is O(log n), where n is the smaller number. This is because the algorithm reduces the problem size by approximately half at each recursive call.

    The space complexity of this algorithm is also O(log n), as it requires a stack depth of approximately log n to perform the recursive calls.

    In terms of space complexity, the recursive approach is more efficient than the iterative approach, which would have a space complexity of O(1).

    However, it's important to note that the actual performance of this algorithm can be significantly impacted by the specific implementation and optimizations used by the Java Virtual Machine (JVM).

     */
    private int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
