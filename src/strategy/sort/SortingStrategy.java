package strategy.sort;

import java.util.List;

public interface SortingStrategy<T extends Sortable> {
	public List<T> sort();
}
