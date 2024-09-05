public class isCenters15{
	public static void main(String[] args){
	    System.out.println(isCenter15(new int[]{3,2,10,4,1,6,9}));
	     System.out.println(isCenter15(new int[]{3,2,0,5}));
	      System.out.println(isCenter15(new int[]{3,2,0,5,3,4}));
	       System.out.println(isCenter15(new int[]{2,3,0,5,3}));
	        System.out.println(isCenter15(new int[]{9,3,1,1,2}));
	         System.out.println(isCenter15(new int[]{0,3,2,0,5,3}));
		
	}

	static int isCenter15(int[] a){
	    int sum;
	    
	    for(int i=0; i<a.length; i++){
	    sum=0;
	        for(int j=i; j<a.length-i; j++){
	            sum=a[j]+sum;
	            if(sum>15){
	                break;
	            }
	        }
	    
	        if(sum==15){
	            return 1;
	        }
	    }
	  return 0;
	        
	  
	   
	    
	}
}