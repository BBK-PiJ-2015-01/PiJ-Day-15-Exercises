import org.junit.*;
import static org.junit.Assert.*;

//
//	Don't forget org.junit.runner.JUnitCore !
//
public class TestPrimeDivisorList {

	private PrimeDivisorList instance;
	
	@Before
	public void init() {
		
		instance = new PrimeDivisorListImpl();
	}
	
	@Test
	public void addValidTest() {
		
		int addValue = 2;
		boolean expected = true;
		boolean result = instance.add(addValue);
		assertEquals(expected, result);
	}
	
	@Test(expected=NullPointerException.class)
	public void addNullTest() {
		
		boolean result = instance.add(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void addInvalidTest() {
		
		int addValue = 4;
		boolean result = instance.add(addValue);
	}
	
	@Test
	public void toStringSimpleTest() {
		
		String expected = "[ 2 = 2 ]";
		int addValue = 2;
		instance.add(addValue);
		String result = instance.toString();
		assertEquals(expected, result);
	}
	
	@Test
	public void toStringSingleMultiTest() {
		
		String expected = "[ 2^3 = 8 ]";
		int addValue = 2;
		instance.add(addValue);
		instance.add(addValue);
		instance.add(addValue);
		String result = instance.toString();
		assertEquals(expected, result);
	}
	
	@Test
	public void toStringTwoMultiValueTest() {
		
		String expected = "[ 2^3 * 3 = 24 ]";
		instance.add(2);
		instance.add(2);
		instance.add(2);
		instance.add(3);
		String result = instance.toString();
		assertEquals(expected, result);
	}
	
	@Test
	public void toStringThreeMultiValueTest() {
		
		String expected = "[ 2^3 * 7^4 * 11 = 211288 ]";
		instance.add(2);
		instance.add(2);
		instance.add(2);
		instance.add(7);
		instance.add(7);
		instance.add(7);
		instance.add(7);
		instance.add(11);		
		String result = instance.toString();
		assertEquals(expected, result);
	}
}