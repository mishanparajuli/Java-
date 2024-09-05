public class IS121{
    public static void main(String[] args){
        System.out.println(is121Array(1,2,1));
        
    }
    
    static int is121Array(int [] a){
        for(int i=0; i<a.length; i++){
        if(a[0]!=(a.length-1)){
            return 0;
        }
        if(a[0]!==1 || a[0]!==2){
            return 0;
        }
        if(a[i]!=1 && a[i]!=2)
        {
            return 0;
            
        }
        
       
}
return 1;
}
}