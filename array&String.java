//SORT STRINGS PROGRAM

/*import java.util.*;

public class Main {
   public static void main(String[] args){
     StringBuilder sb =new StringBuilder("lokojit");
     char[] arr = sb.toString().toCharArray();
     Arrays.sort(arr);
     System.out.println(new String(arr));
   }
   
   static void printArray(String[] arr) {
      for (String s : arr) {
         System.out.print(s + " ");
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


/*import java.util.*;
public class Main {
   public static void main(String[] args){
    int[] arr ={1,1,0,1,1,2,0,1,2,0,0,1,0};
    int n = arr.length;
    int i=0 , j =n-1;
    while(i<j){
        if(arr[i]==0) i++;
        if(arr[j]==1) j--;
        if(arr[i]==1 && arr[j]==0){
            arr[i]=0;
            arr[j]=1;
            i++;
            j--;
        }
        
    }
    for(int ele :arr){
        System.out.print(ele+" ");       
    }
    System.out.println();
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
    int[] arr ={1,1,0,1,1,2,0,1,2,0,0,1,0};
    int n =arr.length;

    int mid =o ,int hi =n-1 ,int lo =0;

        
    }
    for(int ele :arr){
        System.out.print(ele+" ");       
    }
    System.out.println();
   }*/


/*import java.util.*;
public class Main {
   public static void main(String[] args){
      int[] a = {11,33,42,71};
      int[] b ={26,54,69,81};
      int[] c =new int[a.length + b.length ];
      int i=0,j=0,k=0;
      
      while(i<a.length && j<b.length) {
         if(a[i]<=b[j]){
            c[k] = a[i];
            i++;
         }
         else{
            c[k] =b[j];
            j++;
         }
         k++;
      }
      if(j==b.length){// now take elements form a only 
         while(i<a.length){
            c[k]=a[i];
            i++;k++;
         }

      }
      if(i==a.length){// now take the elements from b only
         while(j<b.length){
            c[k]=b[j];
            j++;k++;
         }
      }
      for(int ele :c){
         System.out.print(ele+" ");
      }

   }
} */

/*import java.util.*;
public class Main {
   public static void main(String[] args){
      int[] arr ={12,8,41,37,2,49,16,28,21};
      int n = arr.length;
      int[] ans = new int[n];
      ans[n-1]=-1;

      int nge = arr[n-1];
      for (int i=n-2;i>=0;i--){
         ans[i]=nge;
         nge =Math.max(nge,arr[i]);
      }
      for(int ele : ans){
         System.out.print(ele+" ");
      }

   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
//    char[] arr = {'l','o','k','o','j','i','t'};
//      for(int i=0;i<arr.length;i++){
       //  System.err.print(arr[i]+" ");
       String X = "Raghav agarrg is a good teacher";
       System.out.println(X);
   
 }

}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String str =sc.nextLine();
     System.out.println(str);
   }
}*/


/*import java.util.*;
public class Main {
   public static void main(String[] args){
      String s = "lokojit bisawas";
      System.out.println(s.charAt(4));
      int n = s.length();
      System.out.println(n);   
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.err.print("Eneter a string: ");
      String s = sc.nextLine();
      int n= s.length();
      int count = 0;
      for(int i=0;i<n;i++){
         char ch =s.charAt(i);
         if(isVowel(ch)==true) count++;
      }
      System.out.println(count);
   } public static boolean isVowel(char ch){
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
       return true;  
       else {
         return false;
       }   
   }
}*/


/*import java.util.*;
public class Main {
   public static void main(String[] args){
     String s = "Raghav garg";
     System.out.println(s.indexOf("R"));

     String a ="cdbbcdd";
     String b ="abcdef";
     System.out.println(a.compareTo(b));
     
     String c ="pysics wallah skills";
     System.out.println(c.contains("lla"));
     System.out.println(c.startsWith("py"));

   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
      String a ="abc";
      String b ="xyz";
      System.out.println(a.concat(b));
      System.out.println(a.toLowerCase());
      System.out.println(a.toUpperCase());
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
      String s = "abcde";
      System.out.println(s.substring(3));
      System.out.println(s.substring(1,4));
      System.out.println(s.substring(0,5));
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
      String s = "hello";
      s=s.substring(0,2)+"y"+s.substring(3, 5);
      System.out.println(s);
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
      String s = "raghav";
      String  str =" ";
      for(int i=0;i<s.length();i++){
         if(i%2==0) str += "a";
         else str+=s.charAt(i);
      }
      System.out.println(str);
   }
}*/


/*import java.util.*;
public class Main {
   public static void main(String[] args){
      String s ="abc";
      StringBuilder sb = new StringBuilder(s);
      
      System.out.println(sb.length());
      System.out.println(sb.capacity());
      StringBuilder x = new StringBuilder("10");
      System.out.println(x.capacity());
      System.out.println(x.length());
   }
}*/
/*import java.util.*;
public class Main {
   public static void main(String[] args){
    StringBuilder s= new StringBuilder("Abc");
    System.out.println(s);
    s.append(35);
    System.out.println(s);   
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    StringBuilder sb = new StringBuilder(sc.nextLine());
    int n = sb.length();
    for(int i=0;i<n;i++){
      char ch =sb.charAt(i);
      int ascii = (int)ch;
      if(ascii>=65 && ascii<=90){ //capital value 
         ascii += 32;
      }
      else if(ascii>=97 && ascii<=122){//small value 
         ascii -= 32;
      }
      ch=(char)ascii;
      sb.setCharAt(i,ch);
    }
      System.out.println(sb);
   }
}*/

/*import java.util.*;
public class Main {
   public static void main(String[] args){
     StringBuilder sb =new StringBuilder("abcdef");
     System.out.println(sb);
     sb.deleteCharAt(3);
     System.out.println(sb);
     sb.delete(2,6);
     System.out.println(sb);
     sb.insert(2,true);
     System.out.println(sb);
   }
}*/
/*import java.util.*;
public class Main {

   public static void main(String[] args){
      String str = "java";
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      System.out.println(new String(chars));
   }

}*/















