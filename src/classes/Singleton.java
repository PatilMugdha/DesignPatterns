package classes;

public class Singleton {
	
	
	//constructor private so that no other class can create its objects
	private Singleton(){}
	
	//Bill Pugh
	private static class SingletonHelper{
		private static Singleton INSTANCE = new Singleton();
	}

	public static Singleton getInstance(){
		return SingletonHelper.INSTANCE;
	}
	
	public void showMessage(){
		System.out.println("This is a singleton pattern demo");
	}
}
