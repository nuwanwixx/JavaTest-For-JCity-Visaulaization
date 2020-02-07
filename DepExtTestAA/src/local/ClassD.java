package local;

import main.ClassA;

public class ClassD extends ClassA implements localNotifier, redirect {

	@Override
	public void getDirect() {
		String dum = "Rum";

	}
	
	@Override
	public void getNotified() {
		String dub = "round";
	}

}
