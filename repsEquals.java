public class repsEquals{
	public static void main(String[] args){
	    System.out.println(repsEqual(new int[]{3,2,0,5,3},32053));
	     System.out.println(repsEqual(new int[]{3,2,0,5},32053));
	      System.out.println(repsEqual(new int[]{3,2,0,5,3,4},32053));
	       System.out.println(repsEqual(new int[]{2,3,0,5,3},32053));
	        System.out.println(repsEqual(new int[]{9,3,1,1,2},32053));
	         System.out.println(repsEqual(new int[]{0,3,2,0,5,3},32053));
		
	}

	static int repsEqual(int[]a, int n){
	    int repsEqual=0;
	    for(int lastIndex= a.length-1; lastIndex>=0; lastIndex--){
	        int lastDigit= n%10;
	        n=n/10;
	        if(lastDigit==a[lastIndex]){
	            repsEqual= 1;
	        }else{
	            repsEqual= 0;
	            break;
	        }
	    }
	    
	    return repsEqual;
	    
	}
}