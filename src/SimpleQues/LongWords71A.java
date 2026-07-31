package SimpleQues;


import java.util.Scanner;




public class LongWords71A {
    public static void main(String args[]){
        Scanner ip=new Scanner(System.in);
        int times=ip.nextInt();
        

        
        // done using loop 


        // while (times>0) {
        //     int counter=0;
        //     String word=ip.next();
        //     int length=word.length();
        //     for (int i=1;i<=(length-2);i++){
        //         counter++;
        //     }
        //     if (length>10) {
        //             System.out.println(""+word.charAt(0)+counter+word.charAt(length-1));
        //     } else {
        //             System.out.println(word);
        //     }
        //     times--;
        // }
       
        
        while(times>0){
            String word=ip.next();
            int length=word.length();
            if (length>10) {
            
                System.out.println(""+word.charAt(0)+(word.length()-2)+word.charAt(length-1));
            } else {
                System.out.println(word);
            }
            times--;
        }
       

       
    }
}
