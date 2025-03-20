package com.example.lesson_2;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Mew, Mew!");
	}
}
