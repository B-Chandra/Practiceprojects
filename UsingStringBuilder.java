
public class UsingStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Hi sir....");
		System.out.println(builder);
		builder.append("Good Evening");
		System.out.println(builder);
		String s = builder.toString().toUpperCase();
		System.out.println(s);
	}

}
