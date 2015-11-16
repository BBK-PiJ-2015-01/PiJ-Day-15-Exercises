import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;


//
//	Don't forget org.junit.runner.JUnitCore !
//
public class TestExaggeratingList {

	private List<Integer> instance;
	
	@Before
	public void init() {
		
		instance = new ExaggeratingList<>();
	}
	
	@Test
	public void emptyListSizeTest() {
		
		int expected = 0;
		int result = instance.size();
		assertEquals(expected, result);
	}
	
	@Test
	public void singleListSizeTest() {
		
		int expected = 2;
		instance.add(1);
		int result = instance.size();
		assertEquals(expected, result);
	}
}