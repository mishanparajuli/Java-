

// import java.util.*;

class loops {
    public static void main(String[] args) {
  
      
  
      // checks if number is less than 0
    //   if (number < 0) {
    //     System.out.println("The number is negative.");
    //   }
  
    //   System.out.println("Statement outside if block");
    // }
    /////////////////////for loop//////////////////////
        // for(int i=0; i<11; i++)
        // {
        //     System.out.println(i);
        // }
//////////////////////while loop////////////////////////////
       

    // // int i = 0;
    //     while(i<11){
    //         System.out.println(i);
    //         i++;
    //     }




    //////////////do while/////////////////////

        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<11);
       
       
       
       
       ////////homework///////////
       
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();


        // int sum=0;
        // int i=1;

        // while(i<=n)
        // {
        //     sum+=i;
        //     i++;
        // }
        // System.out.println(sum);


        ///////table////
    //     Scanner sc = new Scanner(System.in);
    //      int n = sc.nextInt();
        
         
    //      for(int i=1; i<11; i++)
    //      {
    // System.out.println(n*i);
    //      }

    /////////factorial////
    //    Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    int fact=1;
    //    for(int i=1; i<=n; i++)
    //    {
    //     fact=fact*i;
    //    }
    //    System.out.println(fact);


    //    ////////star pattern/////

        // for(int i=1; i<=5; i++)
        // {
        //     for(int j=1; j<=i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        ///////////Another Star pattern/////

        // for(int i=0; i<=4; i++)
        // {
        //     System.out.println("*");
        // }



        ///////////solid rectangle star pattern///////

        // for(int i=1; i<=4; i++)
        // {
        //     for(int j=1; j<=5; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        ///////////hollow rectangle star pattern///////
        // int n=4;
        // int m=5;


        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++)
        //     {
        //      if(i==1 || j==1|| i==n|| j==m){
        //         System.out.print("*");
        //      } 
        //      else{
        //         System.out.print(" ");
        //      }
        //     }
        //     System.out.println();
        // }


        ////////////inveted half pyramid//////

//        




        ///////////right hlf pyramid/////////
        // int n=4;
        
        // for(int i=1; i<=n; i++)

        // {
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
            
        //     for(int j=1; j<=i; j++)
        //         {
        //             System.out.print("*");
             
             
        //         }
        //         System.out.println();
        //     }




            //////number pyramid////

            // for(int i=1; i<=5; i++)
            // {
            //     for(int j=1; j<=i; j++)
            //     {
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }
       


        ///inverted number pyramid////
        // int n=5;

        //     for(int i=1; i<=n; i++)
        //     {
        //         for(int j=1; j<=n-i+1; j++)
        //         {
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //     }




        // ////floyds triangle////
        // int n=5;
        // int num=1;

        //     for(int i=1; i<=n; i++)
        //     {
        //         for(int j=1; j<=i; j++)
        //         {
        //             System.out.print(num);
        //             num++;
        //         }
        //         System.out.println();
        //     }





        ///////0-1 triangle////////

        int n=5;

            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=i; j++)
                {
                    if((i+j)%2==0)
                    {
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
            
                }
                System.out.println();
            }













        
        
    }
}


