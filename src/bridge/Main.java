package bridge;

public class Main {
    public static void main(String[] args) {
		Shape circle=new Circle(3, 7, 7, new Screen());
		Shape rectangle=new Rectangle(7, 5, new Printer());

		circle.draw();
		rectangle.draw();
	}
}
