public class Stacked{
    public static void main(String[] args){
        System.out.println(isStacked(5));
        
    }
    
    static int isStacked(int n){
        int num=0;
        for(int i=0; i<=n;i++){
                num+=i;
                if(num==n){
                   return 1;
                  
                }
            }
            return 0;
        }
        
        
    }

