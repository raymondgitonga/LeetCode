// Source : https://leetcode.com/problems/palindrome-number/

/**********************************************************************************
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 2:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 **********************************************************************************/
package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder builder = new StringBuilder();

        builder.append(x);
        builder.reverse();

        return builder.toString().equals(String.valueOf(x));
    }
}
