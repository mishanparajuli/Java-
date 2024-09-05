public class OddHeavy{
    public static int isOddHeavy(int [] a){
        int minOdd= Integer.MAX_VALUE;
        int maxEven= Integer.MIN_VALUE;
        boolean hasOdd= false;
        
        for(int num: a){
            if(num%2!=0){
                hasOdd= true;
                if(num<minOdd){
                    minOdd= num;
                }
            }else{
            if(num>maxEven) maxEven= num;
        }
        }
        if(!hasOdd){
            return 0;
        }
        if(minOdd>maxEven){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args){
        System.out.println(isOddHeavy(new int[] {-2, -4, -6,
-8, -11}));
    }
}