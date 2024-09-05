public class CountRupeees{
    public static void main(String[]args){
        int numRupees=15;
        System.out.println("Number of ways to represent " + numRupees + " rupees: " + countRepresentations(numRupees));
        
    }
    
    
    static int countRepresentations( int numRupees){
    int count=0;
    for (int rupee20=0; rupee20<=numRupees/20; rupee20++){
      for (int rupee10=0; rupee10<=(numRupees-rupee20*20)/10; rupee10++){
           for (int rupee5=0; rupee5<=(numRupees-rupee20*20-rupee10*10)/5; rupee5++){
             for (int rupee2=0; rupee2<=(numRupees-rupee20*20-rupee10*10-rupee5*5)/2; rupee2++){
                int  rupee1=(numRupees-rupee20*20-rupee10*10-rupee5*5-rupee2*2)/1;
               
                
                  count++;
                  
                 
                               
             }
               
           }
          
      }
        
    }  
       return count;                        
                               

}
}