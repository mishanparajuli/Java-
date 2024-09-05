public class Fibonacci{
    public static void main(String [] args){
        System.out.println(isFibonacci(21));
    }
    
    
    static int isFibonacci(int n){
        if(n==1){
            return 1;
        }
        
        // let us take 2 number
        int a=1,b=1;
        
        while(b<n){
            int temp=b;
            b=a+b;
            a=temp;
        }
        
        if(b==n){
            return 1;
        }
        return 0;
    }
}