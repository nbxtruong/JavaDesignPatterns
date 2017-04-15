package abstractInterface;

public abstract class Animal {
    
    protected String name, sound;

    public Animal(String name, String sound){
    	this.name=name;
    	this.sound=sound;
    }

    protected void makeSound(){
    	System.out.println(sound);
    }
}
