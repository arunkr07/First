class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case
        int[] nums = {3, 2, 2, 3, 4, 5};
        int val = 3;
        
        int newLength = solution.removeElement(nums, val);
        
        // Print the modified array and the new length
        System.out.println("New length of the array: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + "  ");
        }
    }
}
