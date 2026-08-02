package Array;

public class GetSecondLargest {
    public static int secondLargest(int[] arr) {
        // code here
        if(arr.length==1){
            return -1;
        }
        int max=-1;
        int max2=-1;
        for (int i=0 ;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        
        return max2;
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34,100, 1};
        System.out.println(secondLargest(arr));
    }
}
