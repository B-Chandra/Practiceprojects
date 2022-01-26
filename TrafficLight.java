import java.io.StringReader;
import java.util.Scanner;

public class TrafficLight {
public static void main(String[] args) {
	String colour;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Colour");
	colour = sc.nextLine();
	switch(colour)
	{
	case "R":
	case "r":
	case "Red":
		System.out.println("STOP");
		break;
	case "Y":
	case "y":
	case "Yellow":
		System.out.println("READY");
	case "G":
	case "g":
	case "Green":
		System.out.println("GO");
	}
}
}
