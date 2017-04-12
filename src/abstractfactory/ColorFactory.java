package abstractfactory;

public class ColorFactory extends AbstractFactory {
    public Shape getShape(String type){
    	return null;
    }

    public Color getColor(String type){
    	if (type==null) {
    		return null;
    	}
    	if (type.equalsIgnoreCase("red")) {
    		return new Red();
    	}
    	if (type.equalsIgnoreCase("blue")) {
    		return new Blue();
    	}
    	if (type.equalsIgnoreCase("black")) {
    		return new Black();
    	}
    	return null;
    }
}
