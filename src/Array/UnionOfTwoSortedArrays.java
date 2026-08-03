// Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
// Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

// Examples:
// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: [1, 2, 3, 4, 5, 6, 7]
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

package Array;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int i =0;
        int j=0;
        while(i<a.length && j<b.length){
            if (a[i]<b[j]){
                if(result.isEmpty() || result.get(result.size() - 1) != a[i]){
                    
                result.add(a[i]);
                }
                i++;
            }
            else if (a[i]>b[j]){
                if(result.isEmpty() || result.get(result.size() - 1) != b[j]){
                    
                result.add(b[j]);
                }
                j++;
            }
            else if(a[i]==b[j]){
                 if( result.isEmpty() || result.get(result.size() - 1) != a[i]){
                    
                result.add(a[i]);
                }
                i++;
                j++;
            }
        }
         while (i < a.length) {
             
            if( result.isEmpty() || result.get(result.size() - 1) != a[i]){
                    result.add(a[i]);
            };
        
            i++;
        }
        
        while (j < b.length) {
           if(result.isEmpty() || result.get(result.size() - 1) != b[j]){
                result.add(b[j]);
            }
            j++;
        }
        
        return result;
       
    }
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,7,7};
        int [] b={-3, -3, -2, -1, 5, 6, 7};
        int []  m={1,2,3,4,5};
        int [] k={1,2,3,5,6,7};
        System.out.println(UnionOfTwoSortedArrays.findUnion(a, b));
        System.out.println(findUnion(m,k));
    }
}
