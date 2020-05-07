public class Main{
	public static void main(String args[]){
		Simulator simulator = new Simulator();
		simulator.playSound(new Dog());
		simulator.cry();
		System.out.println(simulator.getAnimalName());
		simulator.playSound(new Cat());	
		simulator.cry();
		System.out.println(simulator.getAnimalName());
	}
}
