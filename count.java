import java.util.*;
import java.io.*;
public class count {
    public static void main(String[] args) {
        int[] numbers = {3, -2, 5, -14,-1, 8, -5, -7, 9};
        
        int positiveCount = 0;
        int negativeCount = 0;
        
        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        int A= Math.max(positiveCount,negativeCount);//special function
        System.out.println(A);

        // if(positiveCount>=negativeCount){
        //     System.out.print(positiveCount);
        // }
        // else {
        //     System.out.print(negativeCount);
        // }
        
        
    }
}
