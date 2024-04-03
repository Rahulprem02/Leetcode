public class missingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            sum -= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        missingNumber solution = new missingNumber();
        int[] nums1 = {0, 1, 3};
        System.out.println("Missing number in nums1: " + solution.missingNumber(nums1));
    }
}
