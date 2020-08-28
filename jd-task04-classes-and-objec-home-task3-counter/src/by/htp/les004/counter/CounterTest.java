package by.htp.les004.counter;

public class CounterTest {

	private int count;

	public CounterTest() {
		this.count = 0;
	}

	public CounterTest(int count) {
		this.count = count;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CounterTest other = (CounterTest) obj;
		if (count != other.count)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CounterTest [count=" + count + "]";
	}

//increase
//decrease

	public void increase() {
		
		setCount(getCount()+1);
	}

	public void decrease() {
		setCount(getCount()-1);
	}

}
