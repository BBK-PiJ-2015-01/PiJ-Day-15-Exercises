import java.util.*;

public class PrimeDivisorListImpl implements PrimeDivisorList {
	
	private final Map<Integer, Integer> underlying = new TreeMap<>();
	private final Integer INITIAL_VALUE = 1;
	//
	private final String TOSTRING_OPENING_VALUE = "[ ";
	private final String TOSTRING_SEPARATOR = " * ";
	private final String TOSTRING_CLOSING_VALUE = " ]";
	
	public 	boolean add(Integer i) {
		
		if (i == null) {
			throw new NullPointerException("Null value supplied");
		}
		if (!AdditionalMath.isPrime(i)) {
			throw new IllegalArgumentException("Non-prime value supplied");
		}
		if (!underlying.containsKey(i)) {
			underlying.put(i, INITIAL_VALUE);
		} else {
			underlying.put(i, underlying.get(i) + 1);
		}
		return true;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder(TOSTRING_OPENING_VALUE);
		boolean addSeparator = false;
		Integer result = new Integer(0);
		
		for(Map.Entry<Integer, Integer> entry: underlying.entrySet()) {
			
			if (result.equals(0)) {
				result = 1;
			}
			result = result * (int) Math.pow(entry.getKey().doubleValue(), entry.getValue().doubleValue());
			
			if (addSeparator) {
				sb.append(TOSTRING_SEPARATOR);
			} else {
				addSeparator = true;
			}
			if (entry.getValue().equals(INITIAL_VALUE)) {
				
				sb.append(entry.getKey().toString());
				
			} else {
				
				sb.append(entry.getKey().toString() + "^" + entry.getValue().toString());
			}
		}
		sb.append(" = " + result.toString());
		return sb.append(TOSTRING_CLOSING_VALUE).toString();
	}
}