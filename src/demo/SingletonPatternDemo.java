package demo;

import classes.Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		instance.showMessage();
	}
		
}
