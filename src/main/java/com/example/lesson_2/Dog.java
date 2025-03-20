package com.example.lesson_2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Woof, Woof!");
	}
}
