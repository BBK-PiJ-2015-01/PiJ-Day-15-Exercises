public class AdditionalMath {

	/**
	*	Lifted from example on StackOverflow
	*/
	public static boolean isPrime(Integer num){
	
		if (num < 2) {
			return false;
		}
		if ( num > 2 && num%2 == 0 ) {
			return false;
		}
		int top = (int)Math.sqrt(num) + 1;
		for(int i = 3; i < top; i+=2){
			if(num % i == 0){
				return false;
			}
		}
		return true; 
	}
}