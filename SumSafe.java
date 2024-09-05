public class SumSafe{
    public static void main(String[] args){
        System.out.println(isSumSafe(new int[]{5,-2,1}));
        
    }
    
    static int isSumSafe(int[]a){
        int isSumSafe=1;
        int sum=0;
        for(int i=0; i<=a.length;i++){
    
    
                 sum+=a[i];
            
        }
                 
                 for(int i=0; i<=a.length;i++){
                if( a[i]==sum){
                    
                  isSumSafe=0;
                  break;
                  
                }
    
                 }
                  return isSumSafe;
            }
          
            
        }
        
        
    

