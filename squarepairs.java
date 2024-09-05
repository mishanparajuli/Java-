public class squarepairs {
    public static void main(String[] args) {
        int result = SquarePairs(new int[]{11,5,4,20});
        System.out.println(result);
         result = SquarePairs(new int[]{11,5,4,20});
        System.out.println(result);
         result = SquarePairs(new int[]{11,5,4,20});
        System.out.println(result);
    }
    
    
     static  int SquarePairs(int[] a){
        int SquarePairs=0;
        for(int targetIndex=0; targetIndex<a.length; targetIndex++)
        {
            for(int compareIndex=0; compareIndex<a.length; compareIndex++){
                if(a[targetIndex]>0 && a[compareIndex]>0){
                    if(a[targetIndex]<a[compareIndex]){
                        if(isPerfectSquare(a[targetIndex]+a[compareIndex]==1)){
                            SquarePairs++;
                        }
                        
                    }
                
            }
        }
    }
    return SquarePairs;

}
static int isPerfectSquare(int element){
    int isPerfectSquare = 0;
    if(element >= 0){
        double sqrtResult = Math.sqrt(element);
        int base = (int) sqrtResult;
        if((sqrtResult - base) == 0){
            isPerfectSquare = 1;
        }else{
            isPerfectSquare = 0;
        }
    }
    return isPerfectSquare;
}
}