import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class ExaggeratingList<T> implements List<T>{
	
	private ArrayList<T> underlying = new ArrayList<>();
	private final int SMALL_VALUE_SIZE;
	public static final int DEFAULT_SMALL_VALUE_SIZE = 5;

	public ExaggeratingList() {
		this(DEFAULT_SMALL_VALUE_SIZE);
	}
	
	public ExaggeratingList(Integer smallValueSize) {
		SMALL_VALUE_SIZE = smallValueSize;
	}
	
	public boolean add(T o) {
		
		return underlying.add(o);
	}
	
	public void add(int i, T o) {

		underlying.add(i, o);
	}
	
	public boolean addAll(Collection<? extends T> c) {
		
		return underlying.addAll(c);		
	}
	
	public boolean addAll(int i, Collection<? extends T> c) {
		
		return underlying.addAll(i, c);
	}
	
	public void clear() {
		
		underlying.clear();
	}
	
	public boolean contains(Object o) {
		
		return underlying.contains(o);
	}
		
	public boolean containsAll(Collection<?> o) {
		
		return underlying.contains(o);
	}
	
	public void forEach(Consumer<? super T> c) {
		
		underlying.forEach(c);
	}
	
	public T get(int i) {
		
		return underlying.get(i);
	}
	
	public int indexOf(Object o){
		
		return underlying.indexOf(o);
	}
	
	public boolean isEmpty() {
		
		return underlying.isEmpty();
	}
	
	public Iterator<T> iterator() {
		
		return underlying.iterator();
	}
	
	public int lastIndexOf(Object o) {
		
		return underlying.lastIndexOf(o);
	}
	
	public ListIterator<T> listIterator() {
		
		return underlying.listIterator();
	}
	
	public ListIterator<T> listIterator(int i) {
		
		return underlying.listIterator(i);
	}
	
	public Stream<T> parallelStream() {
		
		return underlying.parallelStream();
	}
	
	public boolean remove(Object o) {
		
		return underlying.remove(o);
	}
	
	public T remove(int i) {
		
		return underlying.remove(i);
	}
	
	public boolean removeAll(Collection<?> c) {
		
		return underlying.removeAll(c);
	}
	
	public boolean removeIf(Predicate<? super T> p) {
		
		return underlying.removeIf(p);
	}
	
	public void replaceAll(UnaryOperator<T> u) {
		
		underlying.replaceAll(u);
	}
	
	public boolean retainAll(Collection<?> c) {
		
		return underlying.retainAll(c);
	}
	
	public T set(int i, T o) {
		
		return underlying.set(i, o);
	}
	
	public int size() {
		
		return underlying.size();
	}
	
	public void sort(Comparator<? super T> c) {
		
		underlying.sort(c);
	}
	
	public Spliterator<T> spliterator() {
		
		return underlying.spliterator();
	}
	
	public Stream<T> stream() {
		
		return underlying.stream();
	}
	
	public List<T> subList(int i, int j) {
	
		return underlying.subList(i, j);
	}
	@SuppressWarnings("unchecked")
	public Object[] toArray() {
		
		return underlying.toArray();
	}
	@SuppressWarnings("unchecked")
	public <T> T[] toArray(T[] array) {
		
		return underlying.toArray(array);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}