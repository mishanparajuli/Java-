public class CheckContactSum{
    public static void main(String[] args){
        
        System.out.println(checkConcatenatedSum(198, 2));  // Should return 1
        System.out.println(checkConcatenatedSum(198, 3));  // Should return 0
        System.out.println(checkConcatenatedSum(2997, 3)); // Should return 1
        System.out.println(checkConcatenatedSum(2997, 2)); // Should return 0
        System.out.println(checkConcatenatedSum(13332, 4)); // Should return 1
        System.out.println(checkConcatenatedSum(9, 1));    // Should return 1
    }
        
    
    static int checkConcatenatedSum(int n, int catlen) {
        
              int sum=0;
            int orgNum=n;
        for(int temp=n;temp>0;temp/=10){
            
            int digit=temp%10;
            int concatNum=0;
            
            for(int i=0; i<catlen; i++){
                concatNum=concatNum*10+digit;
            }
            
                sum+=concatNum;
                
            
            }
            
             
       
              return (sum==orgNum)? 1:0;
        }
      
        
    }
