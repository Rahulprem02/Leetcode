public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + majorityElement(nums));
    }
    
    public static int majorityElement(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                max = nums[i];
            }
            if(nums[i] == max) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }
}
