
                
            //     public class perfectsqre{
            //     public static void main (String agrs[]){
                
            //     // Test cases
            //     System.out.println(nextPerfectSquare(6));  // Output: 9
            //     System.out.println(nextPerfectSquare(36)); // Output: 49
            //     System.out.println(nextPerfectSquare(0));  // Output: 1
            //     System.out.println(nextPerfectSquare(-5)); // Output: 0
            
            //     }
            // public static int nextPerfectSquare(int n) {
            //     if (n < 0) {
            //         return 0; // Handling negative numbers
            //     }
                
            //     int root = (int) Math.sqrt(n); // Find the integer part of the square root of n
            //     root += 1; // Increment to get the next integer
            //     return root * root; // Return the square of the next integer
            // }
        
            //     }


            public class perfectsqre{
                public static void main(String[] args) {
                    System.out.println(primeCount(10,30));
                    System.out.println(primeCount(11,29));
                    System.out.println(primeCount(20,22));
                    System.out.println(primeCount(1,1));
                    System.out.println(primeCount(5,5));
                    System.out.println(primeCount(6,2));
                    System.out.println(primeCount(-10,6)); 

                }



                public static int primeCount(int start, int end){
                    int count = 0,i,j,flag;// initalize
                    if (start<2) start =2;// prime no >=2 so start with 2
                    for(i=start;i<=end;i++){
                        if(i==2){
                            ++count;
                            continue;
                        }
                        flag = 1;
                        for(j=2;j<i;j++){
                            if(i%j==0){
                            flag=0;
                            break;
                        }
                    }

                    if(flag==1) ++count;
                    }
                    return count;
                }
            }