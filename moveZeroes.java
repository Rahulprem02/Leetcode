class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int interPosition = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[interPosition] = nums[i];
                interPosition++;
            }
        }
        while(interPosition < nums.length) {
            nums[interPosition++] = 0;
        }
    }
    
    public static void main(String[] args) {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original Array:");
        printArray(nums);
        
        solution.moveZeroes(nums);
        
        System.out.println("Array after moving zeroes:");
        printArray(nums);
    }
    
    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
