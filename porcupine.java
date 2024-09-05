public class porcupine{
	public static void main(String[] args){
		int result = findPorcupineNumber(0);
		System.out.println(result);
		result = findPorcupineNumber(138);
		System.out.println(result);
		result = findPorcupineNumber(139);
		System.out.println(result);
	}

	static int findPorcupineNumber(int n){
		int porcupineNumber = 0;
		int maxValue = Integer.MAX_VALUE;
		boolean isPorcupineNumber = false;
		n++;
		while(n <= maxValue){
			if(isPorcupineNumber){
				if(isPrime(n) == 1){
					if(n % 10 == 9){
						break;
					}else{
						isPorcupineNumber = false;
					}
				}
			}else{
				if(isPrime(n) == 1){
					if(n % 10 == 9){
						isPorcupineNumber = true;
						porcupineNumber = n;	
					}
				}
			}
			n++;
		}
		return porcupineNumber;
	}

	static int isPrime(int number){
	
		if(number <= 1){
		return 0;}
			for(int i = 2; i< Math.sqrt(number); i++){
				if(number % i == 0){
					return 0;
				
				}
			}
		
		return 1;
	}
}      