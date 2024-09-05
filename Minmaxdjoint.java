public class Minmaxdjoint{
    public static void main(String[]args){
        
        System.out.println(isMinMaxDisjoint(new int[]{5,4,1,3,2}) );
        
    }

    
    static int isMinMaxDisjoint( int[] a){
        
        if(a.length<2){
            return 0;
        }
        
        int max=a[0];
        int min=a[0];
        int minIndex=-1;
        int maxIndex=-1;
        
        for(int i=0; i<a.length; i++){
        
                if(a[i]<min){
                    min=a[i];
                    minIndex=i;
                }
                if(a[i]>max){
                    max=a[i];
                    maxIndex=i;
                }
               
            }
            
            
             if(max==min){
                    return 0;
                }
                
                
            int minCount=0;
            int maxCount=0;
            for(int num:a){
                if(num==max) maxCount++;
                if(num==min) minCount++;
            }
            if (minCount != 1 || maxCount != 1) {
            return 0;
        }

        if (Math.abs(minIndex - maxIndex) == 1) {
            return 0;
        }

        return 1;  

}
}