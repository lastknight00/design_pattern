package strategy;

import java.util.List;

import strategy.sort.Sortable;
import strategy.sort.SortingStrategy;
import strategy.sort.impl.BubbleSort;
import strategy.sort.impl.PigeonholeSort;

public class SmartSort<T extends Sortable> {
	final static int BASE = 100;
	final List<T> list;
	final SortingStrategy<T> sortUtil;
	
	public SmartSort(List<T> list) {
		this.list = list;
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(T value : list) {
			max = Math.max(max, value.getValue());
			min = Math.min(min, value.getValue());
		}
		
		if((max - min) <= BASE) {
			sortUtil = new PigeonholeSort<>(min, max, list); 
		} else {
			sortUtil = new BubbleSort<>(list); 
		}
	}

	public List<T> sort() {
		return sortUtil.sort();
	}
}
