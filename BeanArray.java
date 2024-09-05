public class BeanArray{
    public static void main(String [] args){
        System.out.println(isBeanArray(new int[] {0,-1, 1}));
        
        
    }
    
    static int isBeanArray(int []a ){
        
        for(int i= 0; i<a.length; i++){
            
        
        boolean found = false;
        
        for(int j=0; j<a.length; j++){
            if(a[j]==a[i]-1 || a[j]==a[i]+1){
                found = true;
                break;
            }
        }
        
        if(!found) 
            return 0;
    }
    

    return 1;
}
}