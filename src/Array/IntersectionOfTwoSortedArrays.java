// Given two sorted arrays, nums1 and nums2, return an array containing the intersection of these two arrays. Each element in the result must appear as many times as it appears in both arrays; that is, if an element appears x times in nums1 and y times in nums2, it should appear min(x, y) times in the result.

// The intersection of two arrays is an array where all values are present in both arrays.
// Example 1:

// Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]

// Output: [1, 2]

// Explanation:

// The elements 1, 2 are the only elements present in both nums1 and nums2
// Example 2:

// Input: nums1 = [1, 2, 2, 3, 3, 3], nums2 = [2, 3, 3, 4, 5, 7]

// Output: [2, 3, 3]

// Explanation:

// The element 2 appears in both arrays only one time.

// The element 3 appears in both arrays two times so we add element 3 equal to its number of occurrences.



package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {

              
               
                    a.add(nums1[i]);
                

                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        
        
        int [] nums=new int[a.size()];
        for(int k =0;k<a.size();k++){
            nums[k]=a.get(k);
        }
        return nums;
    }
    public static void main(String[] args) {
        
        int [] nums1 = {1, 2, 2, 3, 3, 3};
        int [] nums2 = {2, 3, 3, 4, 5, 7};
        IntersectionOfTwoSortedArrays a1=new IntersectionOfTwoSortedArrays();
        System.out.println(Arrays.toString(a1.intersectionArray(nums1, nums2)));
    }
}
