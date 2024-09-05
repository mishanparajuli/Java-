public class ISLargestSum{
    public static void main(String[] args){
        System.out.println( largestAdjSum(new int[]{18, -12, 9, -10} ));
        
    }
    
    static int largestAdjSum( int[]a){
        
        int max= a[0]+a[1];
        for(int i=1; i<a.length-1; i++){
             
            int currentSum= a[i]+a[i+1];
            
            if(currentSum>max){
                max=currentSum;
            }
            
        }
        return max;
        
    }
}