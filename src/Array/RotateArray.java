// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
// Example :

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]


package Array;

import java.util.Arrays;

public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        if(nums.length==0){
            return new int[0] ;
        }
        k=k%nums.length;
        for (int i =0;i<k;i++){
            int temp=nums[nums.length-1];
            for (int j =nums.length-2;j>=0;j--){
                nums[j+1]=nums[j];

            }
            nums[0]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,6,7};
        int nums2[]={-1,-100,3,99};
        RotateArray re=new RotateArray();
        System.out.println(Arrays.toString(re.rotate(nums1,3)));
        System.out.println(Arrays.toString(re.rotate(nums2,2)));
    }
}
