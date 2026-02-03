/* import java.util.*;
public class Main {
   public static void main(String[] args){   
      int[] arr = new int[5];
      arr[0]=10;
      arr[1]=20;
      arr[2]=30;
      arr[3]=40;
      arr[4]=-50;
      for (int i=0;i<=4;i++){
           System.out.print(arr[i] +" ");
      }
   }
}*/
/* import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={10,20,30,40,50,-9,-12,4,5,6,7};
     int n =arr.length;
     System.out.println(arr.length);
     for (int i=0;i<n; i++){
      System.out.print(arr[i]+" ");
     }
   }
}*/
/*import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={81,45,17,100,12,34};
     int n=arr.length;
     for(int i=0;i<n;i++){
      if(arr[i]<35)
         System.out.print(i +" ");
     }
   }
}*/
/*import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={10,20,30,40,50,-9,-12,4,5,6,7};
     int sum =0;
     int n = arr.length;
     for(int i=0;i<n;i++){
      sum+=arr[i];
     }
     System.out.println(sum);
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={10,20,30,40};
     int sum =1;
     int n = arr.length;
     for(int i=0;i<n;i++){
      sum*=arr[i];
     }
     System.out.println(sum);
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={-10,8,-5,6,-7,-11};
     int n =arr.length;
     int max = Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
      if(arr[i]> max) 
         max = arr[i];
     }
     int smx  =Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
      if(arr[i]!= max)
         if(arr[i]> smx) 
         smx = arr[i];
     }
     System.out.println(max);
     System.out.println(smx);
   }
}*/
/*import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={30,10,40,23,89,34};
     // for each loop : 
     for(int ele : arr){
      System.out.print(ele+" ");}
     Arrays.sort(arr);
     System.out.println();
     for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
     }
     
   }
}*/
/*import java.util.*;
public class Main {
   public static void main(String[] args){
     int[] arr ={30,10,40,23,89,34};
     for(int ele : arr){
      System.out.print(ele+" ");
    }
     System.out.println();
     //int[] num = arr; // shallow copy 
     //num[0] = 70;
     //System.out.println(arr[0]);
     // deep copy 
     int[]  brr= Arrays.copyOf(arr,arr.length);
     brr[0] = 70;
     System.out.println(arr[0]);
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
     ArrayList<Integer> arr =new ArrayList<>(6);
     arr.add(0,10);
     arr.add(1,20);
     arr.add(2,30);
     arr.add(3,40);
     arr.add(4,50);
     System.out.println(arr);
     //for(int i=0;i<=5;i++){
     // System.out.println(arr.get(i)+" ");
     //}

     System.out.println();
     arr.set(2,300);
    // for(int i=0;i<=5;i++){
     // System.out.println(arr.get(i)+" ");  
   }
}*/
/*import java.util.*;
public class Main {
   public static void main(String[] args){
     ArrayList<Integer> list =new ArrayList<>();
     System.out.println(list+" "+list.size());
     list.add(60);
     System.out.println(list+" "+list.size());
     list.add(20);
     System.out.println(list+" "+list.size());

     list.remove(1);
     System.out.println(list+" "+list.size());
   }
}*/
/*public class Main {
   public static void main(String[] args){
   int[] arr ={10,20,30,40,50,60,70,80};
   int n =arr.length;
   for(int ele:arr){
      System.out.print(ele+" ");
   }
   System.out.println();

   //reverse: 
   int i=1 , j=5;
   while(i<=j){
      int temp = arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      i++;
      j--;

   }for(int ele:arr){
      System.out.print(ele+" ");
   }
   System.out.println();
   } 
   //public static void swap(int[] arr, int i ,int j) {
   //   int temp =arr[i];
   //   arr[i]=arr[j];
   //   arr[j]=temp;
   //}   
}*/


// FUNCTION AND METHODS  

/*import java.util.*;

public class Functions {
   public static  void printMyName(String name){
          System.out.println(name);
          return;
  }

  public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     String name =sc.next();

     printMyName(name);
  }
}*/


/*import java.util.*;

public class Functions {
   public static  int calculateSum(int a ,int b){
          int sum =a+b;
          return sum;
  }

  public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
     int a =sc.nextInt();
     int b =sc.nextInt();
     
     int sum =calculateSum(a, b);
     System.out.println(sum);
  }
}*/


































