package iterator.list;

import iterator.Iterator;

public class MyListIterator<T> implements Iterator<T> {
	final private MyList<T> list;
	private int index;
	
	public MyListIterator(MyList<T> myList) {
		this.list = myList;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < this.list.length();
	}

	@Override
	public T next() {
		return list.get(index++);
	}

}
