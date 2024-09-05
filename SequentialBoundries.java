public class SequentialBoundries{
    public static void main(String[]args){
        
        System.out.println(isSequentialBounded(new int[]{0,1}) );
        
    }

    
    static int isSequentialBounded( int[] a){
        
        for(int i=0; i<a.length; i++){
            int count=0;
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    count=count+1;
                }
            }
            if(a[i]<=0 && count>=a[i]) return 0;
            if(i>0 && a[i]<a[i-1] ){
             
                return 0; 
        }
          }     
                
                return 1;

}
}