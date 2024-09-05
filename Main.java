// add 2 number

// import java.util.*;

// class Main{
//   public static void main(String[] args){
//     int x,y,sum;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Type a number");
//     x= sc.nextInt();

//     System.out.println("Type another number");
//     y= sc.nextInt();
//     sum = x+y;
//     System.out.println("The sum is " + sum);
//   }
// }






//word count
// public class Main {

//   public static void main(String[] args) {
//     String x= "My name is Biplab Baskota";
//     int countWord = x.split("\\s").length;
//     System.out.println(countWord);
//   }
// }



//reverse a string

// public class Main{

//   public static void main(String[] args) {
//     String orgX= "Biplab Baskota";
//     String revX = reString(orgX);
//     System.out.println(orgX);
//     System.out.println(revX);
//   }
//   public static String reString(String input)
//   {
//     StringBuilder rev = new StringBuilder(input);
//     return rev.reverse().toString();
// }
// }

//easy reverse string

// public class Main {

//   public static void main(String[] args) {
//     String orgX= "Biplab Baskota";
//     String revX = " ";
//     System.out.println("Original String" + " " +orgX);

//     for(int i=0; i<orgX.length(); i++)
//     {
//       revX = orgX.charAt(i) + revX;


//     }
//     System.out.println("Reversed String:" + revX);
//   }
// }



//arr sum 

// public class Main {

//   public static void main(String[] args) {
//     int[] myArr= {1,2,3,5};
//     int sum =0;  
//     for(int i=0; i<myArr.length; i++)
//     {
//       sum +=myArr[i];
//     }
//     System.out.println(sum);

// }
// }




//string to array

// public class Main {

//   public static void main(String[] args) {
//     String myStr= "HELLO";

// char[] myArr = myStr.toCharArray();
// for(int i=0; i<myStr.length(); i++)
// {
//   System.out.println(myArr[i]);
// }


//   }
// }










public class Main {
  public static char[] stringToArray(String input) {
    // Create a char array of the same length as the input string
    char[] result = new char[input.length()];
    
    // Manually copy each character from the string to the char array
    for (int i = 0; i < input.length(); i++) {
        result[i] = input.charAt(i);
    }
    
    return result;
}
    public static void main(String[] args) {
        String example = "Hello, World!";
        char[] charArray = stringToArray(example);
        
        
        // Print the char array
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }

   
}










