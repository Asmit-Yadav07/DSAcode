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
    public void rotate(int[] nums, int k) {
    //     if(nums.length==0){
    //         return new int[0] ;
    //     }
    //     k=k%nums.length;
    //     for (int i =0;i<k;i++){
    //         int temp=nums[nums.length-1];
    //         for (int j =nums.length-2;j>=0;j--){
    //             nums[j+1]=nums[j];

    //         }
    //         nums[0]=temp;
    //     }
    //     return nums;
    // }

    int n = nums.length;
        if (n == 0) return;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,6,7};
        int nums2[]={-1,-100,3,99};
        RotateArray re=new RotateArray();
        // System.out.println(Arrays.toString(re.rotate(nums1,3)));
        // System.out.println(Arrays.toString(re.rotate(nums2,2)));
        re.rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1));

        re.rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2));
    }
}
