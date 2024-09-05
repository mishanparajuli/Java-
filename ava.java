
//recurison advance 

// public class ava{
//     public static void printPerm(String str, String permut){
//         if(str.length()==0){
//             System.out.println(permut);
//             return;

//         }
//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             String rem = str.substring(0,i) + str.substring(i+1);
//             printPerm(rem, permut+ch);
//         }
        
//     }
//     public static void main(String[] agrs){
//         String str = "abc";
//         printPerm(str, "");
//     }
// }