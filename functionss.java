import java.util.*;

public class functionss {
//     public static int firstNum(int a , int b)//declare
//     {
//         int mul = a * b;
//         return mul;
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          int a= sc.nextInt();
//          int b= sc.nextInt();

//        int mul= firstNum(a, b);//define a new sum to store
//        System.out.println(mul);
// }


    public static void fact(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial *i;

        }
        System.out.println(factorial);
        return;
    }

        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();


        //     fact(n);
            
