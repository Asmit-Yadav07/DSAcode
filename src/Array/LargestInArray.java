package Array;

public class LargestInArray {
    
        public static int largestElement(int[] nums) {
            int max=nums[0];
              for(int i =0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
        }
        public static void main (String []args){
            int []nums={2,3,4,5,6,11,13,2,3};
            System.out.println(largestElement(nums));
          
               
            }

        }
    
    
