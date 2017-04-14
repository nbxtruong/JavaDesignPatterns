package decorator;

public class Main {
    public static void main(String[] args) {
		Shape circle=new Circle();
		circle.draw();

		Shape redCircle=new RedCircle(new Circle());
		redCircle.draw();
	}
}
