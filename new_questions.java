
// import java.util.*;

///BUtterfly pattern///
public class new_questions{

    public static void main(String  agrs[]){
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }

        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // ///2nd half////

        // for(int i=n;i>=1;i--){
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }

        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
       



        //solid rhombus///
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=n-i; j++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();


 
        // }








        ///hollow rhombus///

        
                // int n = 5; // Size of the rhombus
        
                // for (int i = 0; i < n; i++) {
                //     // Print leading spaces
                //     for (int j =n-i; j>1; j--) {
                //         System.out.print(" ");
                //     }
                //     // Print stars and hollow spaces
                //     for (int j = 0; j < n; j++) {
                //         if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                //             System.out.print("*");
                //         } else {
                //             System.out.print(" ");
                //         }
                //     }
                //     // Move to the next line
                //     System.out.println();
                // }



                ////number pyramid////
        //         int n=5;
        //         for(int i=1; i<=n ;i++){
        //                 for(int j=1; j<=n-i; j++)
        //                 {
        //                     System.out.print(" ");
        //                 }
        //                 for(int j=1; j<=i; j++){
        //                     System.out.print(i+ " ");
        //                 }
        //                 System.out.println();



        //     }
        // }
        






                ///palindrome///

                int n=4;
                for(int i=1; i<=n; i++)
                {
                    for(int j=1; j<=n-i; j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1; j<=2*i-1; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }




                for(int i=n; i>=1; i--)
                {
                    for(int j=1; j<=n-i; j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1; j<=2*i-1; j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }

    }


}
