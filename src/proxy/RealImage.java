package proxy;

public class RealImage implements Image {
    private String name;

    public RealImage(String name){
    	this.name=name;
    	load();
    }

    @Override
    public void display(){
    	System.out.println("Displaing "+name);
    }

    public void load(){
    	System.out.println("Loading "+name);
    }
}
