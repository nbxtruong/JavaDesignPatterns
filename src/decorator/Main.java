package decorator;

public class Main {
    public static void main(String[] args) {
		Shape rectangle=new Rectangle();
		rectangle.draw();

		ShapeDecorator redRedtangle= new RedRectangle(rectangle);
		redRedtangle.draw();
	}
}
