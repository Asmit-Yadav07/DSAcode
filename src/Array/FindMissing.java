// You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

// Examples:
// Input: arr[] = [1, 2, 3, 5]
// Output: 4
// Explanation: All the numbers from 1 to 5 are present except 4.

package Array;

public class FindMissing {
    static int missingNum(int arr[]) {
      
        int n=arr.length+1;
       long expectedSum=(long)n*(n+1)/2;
       long sum=0;
       for(int i =0;i<n-1;i++){
           sum+=arr[i];
       }
       return (int)(expectedSum-sum);
    }
    
    public static void main(String[] args) {
        int [] n={1,2,4,5};
        System.out.println(missingNum(n));
    }
}
