import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public List<Integer> plusOne(List<Integer> digits) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int digit : digits) {
            sb.append(digit);
        }

        int x = Integer.parseInt(sb.toString()) + 1;
        String q = Integer.toString(x);

        for (char c : q.toCharArray()) {
            ans.add(Character.getNumericValue(c));
        }

        return ans;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();
        List<Integer> digits = new ArrayList<>();
        digits.add(1);
        digits.add(2);
        digits.add(3);

    

        List<Integer> result = solution.plusOne(digits);

        System.out.println("Input: digits = " + digits);
        System.out.println("Output: " + result);
    }
}
