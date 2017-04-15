package observer;

public class Main {
    public static void main(String[] args) {
		Subject subject=new Subject();

		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);

		System.out.println("First state is 15.");
		subject.setState(15);
	}
}
