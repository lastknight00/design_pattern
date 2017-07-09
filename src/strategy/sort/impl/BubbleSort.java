package strategy.sort.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import strategy.sort.Sortable;
import strategy.sort.SortingStrategy;

public class BubbleSort<T extends Sortable> implements SortingStrategy<T> {
	final List<T> list;
	
	public BubbleSort(List<T> list) {
		this.list = list;
	}

	@Override
	public List<T> sort() {
		final List<T> retval = new ArrayList<>();
		retval.addAll(list);
		
		for(int index = 0; index < list.size(); index++) {
			for(int index2 = 1; index2 < list.size() - index; index2++) {
				if(retval.get(index2).getValue() < retval.get(index2 - 1).getValue()) {
					Collections.swap(retval, index2, index2 - 1);
				}
			}
		}
		return retval;
	}

}
