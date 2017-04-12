package singleton;


public class SingletonObject {
	
	// Constructor
	private SingletonObject(){
		
	}

	// object can use through getObject method only
	private static SingletonObject object=new SingletonObject();

	public static SingletonObject getObject(){
		return object;
	}

	public void showMessage(String message){
		System.out.println(message);
	}
	
}
