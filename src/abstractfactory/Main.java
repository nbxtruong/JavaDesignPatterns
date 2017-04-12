package abstractfactory;

public class Main {
    public static void main(String[] args) {
		AbstractFactory getShapeFactory=AbstractProducer.getFactory("shape");
		Shape getCircle=getShapeFactory.getShape("circle");
		getCircle.draw();

		AbstractFactory getColorFactory=AbstractProducer.getFactory("color");
		Color getBlue=getColorFactory.getColor("blue");
		getBlue.fill();
	}
}
