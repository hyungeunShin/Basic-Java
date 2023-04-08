package Chapter07;

public class AnimalExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.sound();
		c.sound();
		System.out.println("-----");
		
		Animal a = null;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();
		System.out.println("-----");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
