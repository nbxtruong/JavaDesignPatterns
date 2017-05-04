package decorator;

public class RedRectangle extends ShapeDecorator {
    public RedRectangle(Shape shape){
    	super(shape);
    }

    public void fill(){
    	System.out.println("(Red)");
    }

    public void draw(){
    	super.shape.draw();
    	fill();
    }
}
