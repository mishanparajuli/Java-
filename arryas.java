import java.util.*;


public class arryas {
    public static void main(String[] args) {
        // int[] arr= new int[3];
        // arr[0]=70;
        // arr[1]=35;
        // arr[2]=30;
        // System.out.println(arr[0]);
       ////or int [] nameOfArray ={1,2,3,4,5}///
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int numbers[] = new int[size];

    
//////////input///////////
       for(int i=0; i<size; i++)
       {
        numbers[i] = sc.nextInt();
       }
       ///////output/////
       for(int i=0; i<size; i++){
        System.out.println(numbers[i]);
       }
    }
}
