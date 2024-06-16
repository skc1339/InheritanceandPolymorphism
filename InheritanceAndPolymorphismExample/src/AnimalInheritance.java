
public class AnimalInheritance {
	
	public class Animal {
		String name;
		
		public Animal(String name) {
			this.name = name;
		}

		
		public void makeSound() {
			System.out.println("Some generic animal sound");
		}
	}



public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	
	public void makeSound() {
		System.out.println("Bark");
	}
	
	
	public void fetch() {
		System.out.println(name + " is fetching the ball.");
	}	
}

public class Canine {
	public static void main(String[] args) {
		Animal myAnimal = new Animal("Generic Animal");
		myAnimal.makeSound();
	
	    Dog myDog = new Dog("Cooper");
	    myDog.makeSound();
	    myDog.fetch();

	}
 }









