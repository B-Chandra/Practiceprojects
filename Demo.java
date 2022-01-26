package ObjectDemo;

public class Demo {

	public static void main(String[] args) {
		Demo ref = new Demo();
		ref.met();
		System.out.println("Back inside main...");

	}
	void met() {
		this.func();
		System.out.println("Inside met...");
	}
	void func(){
		System.out.println("inside func...");
	}
}
