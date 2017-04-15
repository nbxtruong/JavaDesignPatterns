package abstractInterface;

public class Main {
    public static void main(String[] args) {
		Animal cat = new Cat("Tom");
		cat.makeSound();

		Animal dog=new Dog("Join");
		dog.makeSound();
		((Swimable)dog).swim();
	}
}
