public class Vanilla{
    public static void main(String[] args){
        System.out.println(isVanilla(new int[]{9, 99, -999, 9999, 99999}));
    }
    
    static int isVanilla(int[]a){
         if(a.length==0){
             return 1;
         }
         
         
         int firstDigit= Math.abs(a[0])%10;
         
         for(int i=0; i<a.length; i++){
             int absValue= Math.abs(a[i]);
             
             while(absValue>0){
                 int currvalue= absValue%10;
                 if(currvalue!=firstDigit){
                     return 0;
                 }
                 absValue/=10;
             }
         }
         return 1;
    }
}