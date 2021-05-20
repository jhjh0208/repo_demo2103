package design.duck;

public class Ducksimulation {

	public static void main(String[] args) {
		Duck myDuck = new WoodDuck();
		myDuck.display();
		myDuck.performFly();
		Duck herDuck = new RubberDuck();
		herDuck.display();
		herDuck.performFly();
		herDuck.performQuack();
		Duck himDuck = new MallardDuck();
		himDuck.display();
		himDuck.performFly();
		himDuck.performQuack();
		
		
		//myDuck.performQuack();
		
	}

}
