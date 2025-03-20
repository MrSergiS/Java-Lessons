package com.example;
import com.example.lesson_2.*;

public class App 
{
    public static void main( String[] args )
    {
		// Lesson 1. First app

		System.out.println("Hello world!");
	
		// Lesson 2 & 3. OPP & Maven dependency
		Animal[] animals = {new Dog(), new Cat()};
		animals[0].setName("Bob");
		animals[1].setName("Garfild");

		for (Animal animal : animals) {
			System.out.println("Privet " + animal.getName());
		}
	

    }
}
