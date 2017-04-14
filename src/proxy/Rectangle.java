package proxy;

public class Rectangle implements Shape {
    
    protected Circle circle;
    protected String name;

    public Rectangle(String name){
    	this.name=name;
    }

    @Override
    public void draw(){
    	if (circle==null) {
    		circle=new Circle(name);
    	}
    	circle.fill();
    }
}
