package easy;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean negative = false;

        if (x < 0) {
            negative = true;
            x = -x;
        }

        int result = 0;

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
