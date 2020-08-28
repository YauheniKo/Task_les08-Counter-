package by.htp.les004.logic;

import by.htp.les004.entity.Counter;

public class CounterLogic {
	
public void increase(Counter counter) {
		
		counter.setCounter(counter.getCounter()+1);
		
	}

	public void decrease(Counter counter) {
		counter.setCounter(counter.getCounter()-1);
	}

}
