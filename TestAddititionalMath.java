import org.junit.*;
import static org.junit.Assert.*;

//
//	Don't forget org.junit.runner.JUnitCore !
//
public class TestAddititionalMath {

	private Object instance;
	
	@Before
	public void init() {
		
//		instance = new IntegerBinarySearchImpl();
	}
	@Test
	public void isPrimeTest_0() {
		
		boolean expected = false;
		int testValue = 0;
		boolean result = AdditionalMath.isPrime(testValue);
		assertEquals(expected, result);
	}
	
	@Test
	public void isPrimeTest_1() {
		
		boolean expected = false;
		int testValue = 1;
		boolean result = AdditionalMath.isPrime(testValue);
		assertEquals(expected, result);
	}
	
	@Test
	public void isPrimeTest_2() {
		
		boolean expected = true;
		int testValue = 2;
		boolean result = AdditionalMath.isPrime(testValue);
		assertEquals(expected, result);
	}
	
	@Test
	public void isPrimeTest_3() {
		
		boolean expected = true;
		int testValue = 3;
		boolean result = AdditionalMath.isPrime(testValue);
		assertEquals(expected, result);
	}
	
	@Test
	public void isPrimeTest_4() {
		
		boolean expected = false;
		int testValue = 4;
		boolean result = AdditionalMath.isPrime(testValue);
		assertEquals(expected, result);
	}
}