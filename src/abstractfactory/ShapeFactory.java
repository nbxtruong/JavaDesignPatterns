package abstractfactory;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String type){
    	if (type==null) {
    		return null;
    	}
    	if (type.equalsIgnoreCase("circle")) {
    		return new Circle();
    	}
    	if (type.equalsIgnoreCase("square")) {
    		return new Square();
    	}
    	if (type.equalsIgnoreCase("rectangle")) {
    		return new Rectangle();
    	}
    	return null;
    }

    public Color getColor(String type){
    	return null;
    }
}
