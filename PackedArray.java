public class Main{
    public static void main(String[] args){
        System.out.println(isPacked(new int[] {4, 4, 4,
4, 1, 2, 2,3, 3, 3}));
        
    }
    public static int isPacked(int[]a){
        for(int num: a){
            if(num<=0) return 0;
        }
        for(int i=0; i<a.length;){
            int value=a[i];
            int acount=0;
            int ccount=0;
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    acount++;
                }
            }
            while(i<a.length && a[i]==value){
                ccount++;
                i++;
            }
            if(ccount!=value || acount!=ccount){
                return 0;
            }
            
        }
        return 1;
    }
}public class Main{
    public static void main(String[] args){
        System.out.println(isPacked(new int[] {4, 4, 4,
4, 1, 2, 2,3, 3, 3}));
        
    }
    public static int isPacked(int[]a){
        for(int num: a){
            if(num<=0) return 0;
        }
        for(int i=0; i<a.length;){
            int value=a[i];
            int acount=0;
            int ccount=0;
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    acount++;
                }
            }
            while(i<a.length && a[i]==value){
                ccount++;
                i++;
            }
            if(ccount!=value || acount!=ccount){
                return 0;
            }
            
        }
        return 1;
    }
}