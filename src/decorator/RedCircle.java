package decorator;

public class RedCircle extends ShapeDecorator {
    
    public RedCircle(Shape object){
    	super(object);
    }

    private void fillColor(Shape object){
    	System.out.println("It is red.");
    }

    @Override
    public void draw(){
    	object.draw();
    	fillColor(object);
    }
}
