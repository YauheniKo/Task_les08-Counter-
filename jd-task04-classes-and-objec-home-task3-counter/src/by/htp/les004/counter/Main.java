package by.htp.les004.counter;

public class Main {

	public static void main(String[] args) {
		CounterTest counter = new CounterTest(10);
		System.out.println(counter.getCount());
		counter.decrease();
		System.out.println(counter.getCount());
		counter.decrease();
		System.out.println(counter.getCount());

	}
}
