package local;

public class ClassC implements localNotifier, redirect {
	int x = 0;
	int y = 0;
	
	public ClassC(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int Sum() {
		int sum = this.x + this.y;
		return sum;
	}

	public void getNotified() {
		String blob = "Stub";
		
	}

	@Override
	public void getDirect() {
		// TODO Auto-generated method stub
		
	}
	
}
