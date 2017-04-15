package abstractInterface;

public class Dog extends Animal implements Swimable {
    
    public Dog(String name){
    	super(name, "gau");
    }

    @Override
    public void swim(){
    	System.out.println("Swimming !!!");
    }
}
