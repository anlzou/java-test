public class Simulator{
	Animal animal;
	void playSound(Animal animal){
		this.animal = animal;
	}
	void cry(){
		animal.cry();
	}
	String getAnimalName(){
		return animal.name; 
	}
}