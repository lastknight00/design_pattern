package strategy.sort.impl;

import java.util.ArrayList;
import java.util.List;

import strategy.sort.Sortable;
import strategy.sort.SortingStrategy;

public class PigeonholeSort<T extends Sortable> implements SortingStrategy<T> {
	final int MIN;
	final int MAX;
	final int SIZE;
	
	final List<T> list;
	public PigeonholeSort(final int min, final int max, final List<T> list) {
		this.MIN = min;
		this.MAX = max;
		this.SIZE = max - min + 1;
		this.list = list;
	}

	@Override
	public List<T> sort() {
		final List<T> retval = new ArrayList<>();
		List<List<T>> values = new ArrayList<>(SIZE);
		for(int index = 0; index < SIZE; index++) {
			values.add(new ArrayList<T>());
		}
		for(T s : list) {
			values.get(s.getValue() - MIN).add(s);
		}
		
		for(List<T> list : values) {
			for(T obj : list) {
				retval.add(obj);
			}
		}
		return retval;
	}

}
