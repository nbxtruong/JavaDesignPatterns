package decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape object;

    public ShapeDecorator (Shape object){
    	this.object=object;
    }

    @Override
    public void draw(){
    	object.draw();
    }
}
