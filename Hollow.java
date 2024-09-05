public class Hollow{
    public static int isHollowArray(int[] arr){
        int leftindex=0;
        int zeroindex=0;
        int rightindex=0;
        int i=0;
        for(i=0;i<arr.length && arr[i]!=0;i++){
            leftindex=leftindex+1;
        }
        for (;i<arr.length && arr[i]==0;i++){
            zeroindex=zeroindex+1;
        }
        for(;i<arr.length && arr[i]!=0;i++){
            rightindex=rightindex+1;
        }
        if(i==arr.length && zeroindex>=3 && (leftindex==rightindex)){
            return 1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,5,0,0,0,3,4,2,5};
        System.out.println(isHollowArray(arr));
}
}
