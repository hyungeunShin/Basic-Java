package Chapter10;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog d = new Dog();
		change(d);
		
		Cat c = new Cat();
		change(c);
	}
	
	public static void change(Animal a) {
		if(a instanceof Dog) {
			//Dog d = (Dog) a;
		} else if(a instanceof Cat) {
			//Cat c = (Cat) a;
		} else {
		}
		//Dog d = (Dog) a;
	}
}
