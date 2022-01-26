
public class UsingStringBuffer {
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer ("Hello sir ..");
		System.out.println(buffer);
		buffer.append("How are u");
		System.out.println(buffer);
		String str = buffer.toString().toUpperCase();
		System.out.println(str);
	}

}
