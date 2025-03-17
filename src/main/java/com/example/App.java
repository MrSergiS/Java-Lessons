package com.example;
import com.example.lesson_2.Animal;
import com.example.lesson_2.Dog;
import com.example.lesson_2.Cat;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

	// Lesson 2
	Animal[] animals = new Animal[3];
	animals[0] = new Animal("Animal");
	animals[1] = new Dog("Bob");
	animals[2] = new Cat("Kitty");

	for (Animal animal : animals) {
		System.out.println(animal.getName() + " says: ");
	       	animal.makeSound();
	}
    }
}
