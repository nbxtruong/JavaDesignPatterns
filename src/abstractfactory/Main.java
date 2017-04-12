package abstractfactory;

public class Main {
    public static void main(String[] args) {
		AbstractFactory getShapeFactory=AbstractProducer.getFactory("shape");
		Shape getCircle=getShapeFactory.getShape("circle");
		getCircle.draw();
	}
}
