package abstractfactory;

public class AbstractProducer {
    public static AbstractFactory getFactory(String type){
    	if (type==null) {
    		return null;
    	}
    	if (type.equalsIgnoreCase("shape")) {
    		return new ShapeFactory();
    	}
    	if (type.equalsIgnoreCase("color")) {
    		return new ColorFactory();
    	}
    	return null;
    }
}
