package bridge;

public class Rectangle extends Shape {
    private int h, w;

    public Rectangle(int h, int w, DrawShape drawShape){
    	super(drawShape);
    	this.h=h;
    	this.w=w;
    }

    public void draw(){
    	this.drawShape.drawRectangle(h, w);
    }
}
