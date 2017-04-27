package delegate;

public class Main {
    public static void main(String[] args) {
		ISomeMethod runSomeThing=new TypeAMethod();
		runSomeThing.someMethod();

		runSomeThing=new TypeBMethod();
		runSomeThing.someMethod();
	}
}
