package OOPExercise;

public class Smartwatch {
	String model = "Vivosmart HR", color = "midnight blue", brand = "Garmin";
	int calling;
	String bluetooth = "Bluetooth is connected. ";
	String touchscreen = "Yes. The screen can be touch.";
	String detect = "Yes. It can detect the heartbeat and walking step from the user.";
	String messaging = "I miss you";
	
	void printCalling() {//method
		calling = 2;
		System.out.println("When press "+ calling + " will call to his father");
	}
	
	void printBluetooth() {
		System.out.println(bluetooth+ "\nIt allows to share anything to anyone.");
	}
	
	void printMessaging() {
		System.out.println("Ahmad texts \"" + messaging + "\" to his wife by this smartwatch");
	}

	void printTouchscreen() {
		System.out.println(touchscreen);
	}
	
	void printDetect() {
		System.out.println(detect);
	}
}
