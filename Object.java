package ObjectDemo;

public class Object {
	public static void main (String []args) {
		
		car ref = new car();
		ref.model();
	}

}

class car{
	int front,reverse;
	double wheels,seats;
	void gear() {
		System.out.println("Move the car");
	}
	void Break() {
		System.out.print("Stop the car");
	}
	void colour() {
		System.out.println("colour");
	}
	void model() {
		System.out.println("model of car");
	}
}