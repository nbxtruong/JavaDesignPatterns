package proxy;

public class Circle implements Shape {
    
    protected String name;

    public Circle (String name){
    	this.name=name;
    	draw();
    }

    @Override 
    public void draw(){
    	System.out.println("Draw "+name);
    }

    public void fill(){
    	System.out.println("Fill "+name);
    }
}
