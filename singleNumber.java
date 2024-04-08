class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res = nums[i] ^ res;
        }
        return res;
    }
    
    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
