package week7;

public class Pet {
	String name;
	String species;
	int age;
	String color;

	Pet(String name, String species, int age, String color){
		this.name = name;
		this.species = species;
		this.age = age;
		this.color = color;
	}
	
	Pet(String name, String species){
		this.name = name;
		this.species = species;
		this.color = "미정";
	}
}
