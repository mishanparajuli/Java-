
import java.util.*;



class Hello{
public static void main (String args[])
{
    
    //String name=sc.next();  //next le 1ota matra token linxa

    //System.out.println(name); //nextline le dherai string linxa

    //nextint
    //nextfloat
    //nextlong
    //nextdouble


    //Scanner sc = new Scanner(System.in);
    //int a= sc.nextInt();
    //int b=sc.nextInt();
    //int sum=a+b;
    //System.out.println(sum);



// Conditional Statements





/*if(age>18)
{
    System.out.println("Adult");
}
else{
    System.out.println("Minor");
}*/
// 
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();


switch (c) {
    case 1:
     c=a+b;
    System.out.println(c);
    break;
    case 2:
    c=a-b;
    System.out.println(c);
        
        break;

    default:
    System.out.println("Invalid");
        break;
}









}
}