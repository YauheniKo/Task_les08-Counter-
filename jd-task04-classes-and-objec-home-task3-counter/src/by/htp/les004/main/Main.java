package by.htp.les004.main;

import by.htp.les004.entity.Counter;
import by.htp.les004.logic.CounterLogic;
import by.htp.les004.print.CounterPrint;

public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter(10);
		CounterLogic logic = new CounterLogic();
		CounterPrint print = new CounterPrint();
		
		print.printCount(counter);
		
		logic.increase(counter);
		
		print.printCount(counter);
		
		logic.decrease(counter);
		
		print.printCount(counter);
		

	}

}