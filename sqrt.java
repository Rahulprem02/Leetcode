public class sqrt {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;

        while (left < right) {
            int mid = (left + right + 1) / 2;
            if ((long)mid * mid <= x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        sqrt solution = new sqrt();
        int x = 8;
        System.out.println("Square root of " + x + ": " + solution.mySqrt(x));
    }
}
