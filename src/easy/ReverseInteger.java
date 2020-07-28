// Source : https://leetcode.com/problems/reverse-integer/
/**********************************************************************************
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output: 321
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 *
 **********************************************************************************/
package easy;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean negative = false;
        int result = 0;

        if (x < 0) {
            negative = true;
            x = -x;
        }

        while (x > 0) {
            int modulo = x % 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && modulo > 7)) {
                return 0;
            }
            System.out.println(x);

            result = result * 10 + modulo;

            x = x / 10;
        }

        if (negative) {
            return -result;
        }
        return result;
    }
}
