public class guthrie{
    
    public static void main(String[]args){
        int result1 = isGuthrieSequence(new int[]{8,4,2,1});
        System.out.println(result1);
        
        int result2 = isGuthrieSequence(new int[]{8,17,4,1});
         System.out.println(result2);
        int result3 = isGuthrieSequence(new int[]{8,4,1});
         System.out.println(result3);
        int result4 = isGuthrieSequence(new int[]{8,4,2});
         System.out.println(result4);
        
    }
    
    
    static int isGuthrieSequence(int[ ] a){
    
    if(a.length<2 || a[a.length-1]!=1){
        return 0;
    }
    int prev=a[0];
    
    for (int i=1; i<a.length; i++){
        int current;
        if(prev%2==0){
            current= prev/2;
        }else{
            current= prev*3+1;
        }
        if(current!=a[i]) return 0;
        
        prev=a[i];
    }
            
 
        return 1;
    }
}