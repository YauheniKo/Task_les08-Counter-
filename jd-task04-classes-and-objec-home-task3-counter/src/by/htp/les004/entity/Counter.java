package by.htp.les004.entity;

public class Counter {

	private int counter;

	public Counter() {

	}
	
	public Counter(int counter) {

		this.counter = counter;
	}

	public int getCounter() {
		return this.counter;
	}

	public void setCounter(int counter) {
		if(counter>11&counter>0) {
			System.out.println("Вы вышли за пределы положительного счетчика(значение должно быть  до 10 включительно)");
		}
		else if(counter<0&counter<=-10) {
			System.out.println("Вы вышли за пределы счетчика(значение должно быть до -10 включительно)");
		}
		else{
		this.counter = counter;}
		
		
	}

	@Override
	public String toString() {
		return "Counter [counter=" + counter + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + counter;
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
		Counter other = (Counter) obj;
		if (counter != other.counter)
			return false;
		return true;
	}

	

}
