import java.util.Arrays;

public class Solution {
    /*
     * @param nums: an array of integer
     * @param target: An integer
     * @return: An integer
     */
    public int twoSum6(int[] nums, int target) {

        if(nums == null || nums.length == 0){
            return 0;
        }

        Arrays.sort(nums);
        int count = 0;
        int index1 = 0;
        int index2 = nums.length-1;

        while (index1 < index2){

            if(nums[index1]+nums[index2] < target){
                index1++;
            }
            else if(nums[index1]+nums[index2] > target){
                index2--;
            }
            else if(nums[index1]+nums[index2] == target){
                index1++;
                index2--;
                count++;
                while(index1 < index2 && nums[index1-1] == nums[index1] && nums[index2+1] == nums[index2]){
                    index1++;
                    index2--;
                }
            }

        }

        return count;
    }
}