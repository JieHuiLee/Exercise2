package OOPExercise;

public class Rabbit {
    String skinColor = "black", size = "medium", breed = "Belgian Hare";
    double w;//weight
    String hop = "Its movement by hop";
    String dig = "It likes to dig holes to put carrots";
    
    void printW() {
    	w = 3.4;
    	System.out.println("This pet rabbit is weights around " + w + " kg");
    }
    
    void printHop() { //behaviour of rabbit
    	System.out.println(hop);    	
    }
    
    void printDig() { 
    	System.out.println(dig);    	
    }
	
	
}
