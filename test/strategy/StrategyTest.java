package strategy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import strategy.sort.Sortable;

public class StrategyTest {
	@Test
	public void testPigeonhole() throws Exception {
		List<Value> list = Arrays.asList(new Value(2),new Value(4),new Value(1),new Value(3),new Value(5));
		SmartSort<Value> sort = new SmartSort<>(list);
		List<Value> sortedList = sort.sort();
		for(Value v : sortedList) {
			System.out.println(v.getValue());
		}
	}
	@Test
	public void testBubble() throws Exception {
		List<Value> list = Arrays.asList(new Value(2),new Value(400),new Value(1),new Value(3),new Value(5));
		SmartSort<Value> sort = new SmartSort<>(list);
		List<Value> sortedList = sort.sort();
		for(Value v : sortedList) {
			System.out.println(v.getValue());
		}
	}
	
	class Value implements Sortable {
		private final int value;
		
		public Value(int value) {
			this.value = value;
		}

		@Override
		public int getValue() {
			return value;
		}
		
	}
}
