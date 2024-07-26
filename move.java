

import java.util.*;
public class move {
    public static void main(String[] args) {
        int a[]={-2,-5,-6,8,7,99,-58,-96} ;
        int n = a.length;

        Arrays.sort(a);
        System.out.println(a);
        for (int index = 0; index < n; index++) {
            
            System.out.println(a[index]);
            
        }
       

 for(int i= 0;i<n;i++) {
    if(a[i]<0){
        System.out.print(" ");

       System.out.print(a[i]);
   }
            


 }
 for(int i= 0;i<n;i++)
        {
  if(a[i]>0){
         System.out.print(" ");

       System.out.print(a[i]);
  }
            

 }


     } 
    }
