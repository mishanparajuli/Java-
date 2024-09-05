public class newInertial {

    public static int isInertial(int[] a){
        if(a.length< 2) return 0;
        int i,j,max=a[0],odd=0;
        int[] oddArray = new int[a.length];

        for(i=0,j=0;i<a.length;i++){
            if((a[i]%2)!=0) oddArray[odd++]=a[i];
            if(a[i]>max) max=a[i];
        }
        if(max%2!=0 || odd<1) return 0;
        for(i=0; i<odd; i++){
            for(j=0;j<a.length; j++){
            if(a[j]% 2==0 && a[j]!= max && a[j]>oddArray[i]) return 0;
        }
    }
        return 1;
    
   
    }






    public static void main(String[] args) {
        int a1[]={1};
        int a2[]={2};
        int a3[]={1,2,3,4};
        int a4[]={1,1,1,1,1,1,2};
        int a5[]={2,12,4,6,8,11};
        int a6[]={2,12,12,4,6,8,11};
        int a7[]={-2,-4,-6,-8,-11};
        int a8[]={2,3,5,7};
        int a9[]={2,4,6,8,10};

        System.out.println(isInertial(a1));
        System.out.println(isInertial(a2));
        System.out.println(isInertial(a3));
        System.out.println(isInertial(a4));
        System.out.println(isInertial(a5));
        System.out.println(isInertial(a6));
        System.out.println(isInertial(a7));
        System.out.println(isInertial(a8));
        System.out.println(isInertial(a9));

    }
    
}
