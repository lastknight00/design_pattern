package iterator.list;

import java.util.ArrayList;
import java.util.List;

import iterator.Iterable;
import iterator.Iterator;

public class MyList<T> implements Iterable<T> {
	final private List<T> list;
	
	public MyList() {
		list = new ArrayList<T>();
	}
	
	public MyList<T> add(final T obj) {
		list.add(obj);
		return this;
	}
	
	public MyList<T> addAll(final List<T> list) {
		this.list.addAll(list);
		return this;
	}
	
	public T get(final int index) {
		return list.get(index);
	}
	
	public int length() {
		return list.size();
	}
	@Override
	public Iterator<T> iterator() {
		return new MyListIterator<T>(this);
	}

}
