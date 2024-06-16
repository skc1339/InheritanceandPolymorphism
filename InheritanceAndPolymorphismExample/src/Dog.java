

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	
	public void makeSound() {
		System.out.println("Bark");
	}
	
	
	public void fetch() {
		String name;
		System.out.println(name + " is fetching the ball.");
	}
	
}
