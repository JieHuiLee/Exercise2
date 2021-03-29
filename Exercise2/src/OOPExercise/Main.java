package OOPExercise;

public class Main {

	public static void main(String[] args) {
		Smartwatch a = new Smartwatch(); //create new object name as a
		System.out.println("The model of the smartwatch is " + a.model);
		System.out.println("It has " + a.color +" color and its brand is " + a.brand);
		
		Smartwatch b = new Smartwatch(); //create second object name as b
		b.printCalling();
		b.printBluetooth();
		b.printMessaging();
		b.printTouchscreen();
	    b.printDetect();
	    System.out.println();
	    
	    Rabbit m = new Rabbit();
	    System.out.println("My pet rabbit is " + m.breed);
		System.out.println("It has " + m.skinColor +" skin color and it size at " + m.size);
		m.printW(); //print the rabbit's weight
		
		Rabbit n = new Rabbit();
		n.printHop();
		n.printDig();
	}

}
