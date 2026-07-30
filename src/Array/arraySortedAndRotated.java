// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.



package Array;

public class arraySortedAndRotated {
  public static boolean check(int[]nums){
    int count=0;
    for(int i =0;i<nums.length;i++){
      if(nums[i]>nums[(i+1)%nums.length]){
          count++;
      }
    }
    if(count>1){
      return false;
    }else{
      return true;

  }
  }
  public static void main(String[] args) {
    // false
    // int[] nums = {2,1,3,4};   
    
    // true
    int[]nums = {3,4,5,1,2};
    System.out.println(check(nums));
  }
}
