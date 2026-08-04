// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Example 1:
// Input: nums = [2,2,1]
// Output: 1

package Array;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int n=nums.length;

        // tc=O(nsquare)
        // sc=O(1)
        // for(int i =0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==nums[i]){
        //             count++;
        //         }                                    
        //     }
        //     if(count==1){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // tc=O(n)
        // sc=O(1)
        int result=0;
        for(int num:nums){
            result^=num;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
