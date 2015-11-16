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
	public void standardMethodTest() {
		
	}
}