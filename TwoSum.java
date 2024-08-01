class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int sum=0;
        int j=1;
        for(i=0;i<nums.length;i++){
            if(j>i && j<nums.length){
                sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[] {i, j};
                }
                j++;
            }
        }
        return null;
    }
}
public class TwoSum{
    public static void main(String[] args) {
        int[] nums={3,2,3};
        int target=6;
        Solution obj=new Solution();
        obj.twoSum(nums, target);
        System.out.println("hello");
    }
}