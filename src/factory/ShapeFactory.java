package factory;

public class ShapeFactory {
    public static Shape getShape(String typeShape){
    	if (typeShape==null) {
    		return null;
    	}
    	if (typeShape.equalsIgnoreCase("circle")) {
    		return new Circle();
    	}
    	if (typeShape.equalsIgnoreCase("rectangle")) {
    		return new Rectangle();
    	}
    	if (typeShape.equalsIgnoreCase("square")) {
    		return new Square();
    	}
        return null;
    }
}
