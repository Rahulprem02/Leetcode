import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;

            if (map.containsKey(rem)) {
                int index = map.get(rem);
                if (index == i) continue;
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }
}
