// import java.util.*;

// public class Sum {

//     public static void main(String[] args) {
//         String[] alphaBet= {"banana", "coconut", "apple","fruit", "egg"};
//         Arrays.sort(alphaBet);
//         System.out.println("Sorted Array" + Arrays.toString(alphaBet));


//     }
// }




///average of the array//
// public class Sum {

//     public static void main(String[] args) {
//         int[] arr = {20,10,12,11,25};
//         float sum =0;
        
//         int length = arr.length;
//         int lowestAge =arr[0];

//         for(int arrs: arr){

//             if(lowestAge >arrs){
//                 lowestAge =arrs;

//             }
                 
//         }
        
//         System.out.println("average of arr :" +lowestAge);
//     }
// }



//loop through list
// import java.util.*;
// public class Sum {

//     public static void main(String[] args) {
//         ArrayList<String> cars= new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Mazda");
//         cars.add("Toyota");
//         System.out.println(cars);
//     }
// }











// abstract class Animal{
//     public abstract void aniSound();
//     public void sleep(){
//         System.out.println("Zzzzzzzzzzzzzzz");



//     }
// }

// class Pig extends Animal{
//     public void aniSound(){
//         System.out.println("Oink oink");
//     }
// }

// class Sum{
//     public static void main(String[] args) {
//         Pig mypig = new Pig();
//         mypig.aniSound();
//         mypig.sleep();
//     }
// }
// import java.util.*;
// public class Sum {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a ");
//         double a = sc.nextDouble();

//         System.out.println("Enter the value of r ");
//         double r = sc.nextDouble();

//         System.out.println("Enter the value of n ");
//         double n = sc.nextDouble();
        
        

//        double sum;
//        if (r==1){
//         sum= a*n;

//        }
//        else{
//         sum= a*(1-Math.pow(r,n))/(1-r);
//        }
//        System.out.println("the sum of first" +n+ "terms is "+ sum);
     
//     }
// }




public class Sum{
    public static int fun3(int[] array){
        if(array==null || array.length<4) return 0;
        int evenindex=array[0];
        int oddindex=array[1];
        for(int i=2;i<array.length;i++){
            if(i%2==0 && evenindex<array[i])
               evenindex=array[i]; 
            
            else if(i%2!=0 && oddindex > array[i])
                oddindex=array[i];
            
            else
              return 0;  
            
           // return 1;
 
        }
        return 1;
        
    }
    public static void main(String[] args) {
        int a1[]={1,6,3,4,8,2};
        int a2[]={1,6,3,4,1,2};
        System.out.println(fun3(a1));
        System.out.println(fun3(a2));
    
    
    }
}























//     public static void main(String[] args) {
//         System.out.println(fun1(168));
//         System.out.println(fun1(121));
//         System.out.println(fun1(7));
//         System.out.println(fun1(1));
//         System.out.println(fun1(0));
//         System.out.println(fun1(-147));
//         System.out.println(fun1(11));
//         System.out.println(fun1(00012));
//         System.out.println(fun1(19));

//     }
//     public static int fun1(int n){
//       if(n<=0) return 0;
//       else if (n==1) return 1;
//       int i=2;
//       while (i<=n)
//       {
//         if(n%i==0) return n/i;
//         else i++;
//       }
//         return 0;
      
//     }

// }