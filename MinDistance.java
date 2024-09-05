public class MinDistance{
    public static void main(String [] args){
        System.out.println(minDistance(13013)); // Output: 2
        System.out.println(minDistance(8));     // Output: 1
        System.out.println(minDistance(100));   // Output: 1
    
        
    }
    
    static int minDistance( int n){
        
        int minDistance= Integer.MAX_VALUE;
        int previousFactor=-1;
        
        for( int i=1; i<=n ; i++){
            if(n%i==0){
                if(previousFactor!=-1){
                    int distance= i-previousFactor;
                    minDistance= Math.min(minDistance, distance);
                }
                previousFactor=i;
            }
        }
        return minDistance;
    }
}