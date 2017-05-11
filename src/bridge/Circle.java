package bridge;

public class Circle extends Shape {
    private int x, y, r;

    public Circle(int r, int x, int y, DrawShape drawShape){
    	super(drawShape);
    	this.r=r;
    	this.x=x;
    	this.y=y;
    }

    public void draw(){
    	this.drawShape.drawCircle(r, x, y);
    }
}
