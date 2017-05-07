package decorator;

public class RedRectangle extends ShapeDecorator {
    public RedRectangle(Shape shape){
    	super(shape);
    }

    private void fill(){
    	System.out.println("(Red)");
    }

    public void draw(){
    	super.shape.draw();
    	fill();
    }
}
