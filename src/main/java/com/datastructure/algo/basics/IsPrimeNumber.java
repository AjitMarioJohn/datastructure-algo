package com.datastructure.algo.basics;

/**
 * Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.
 *
 * Example 1:
 * Input: N = 3
 * Output: Prime
 * Explanation: 3 is a prime number
 *
 * Example 2:
 * Input: N = 26
 * Output: Non-Prime
 * Explanation: 26 is not prime
 */
public class IsPrimeNumber {
    public boolean isPrime(int number) {
        return solution2(number);
    }

    private boolean solution1(int number) {
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /*
    Time Complexity: The time complexity of this algorithm is O(sqrt(n)) in the worst case.
    This is because in each iteration of the loop, we are checking if the number is divisible by a divisor that starts from 2 and goes up to the square root of the number.

    In the worst case, when the number is not prime, it will be divisible by one of the numbers between 2 and the square root of the number. Therefore, the loop will execute at most sqrt(n) times.

    Space Complexity: The space complexity of this algorithm is O(1), which means constant.
    This is because the algorithm does not use any extra space that grows with the input size. It uses a single variable divisor for the loop, which takes a constant amount of space regardless of the input size.

    In summary, the time complexity of the algorithm is O(sqrt(n)), and the space complexity is O(1).
     */
    private boolean solution2(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
