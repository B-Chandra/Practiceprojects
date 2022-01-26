
public class AnnonymousInnerClass {
public static void main(String[] args) {
		
		//I have a requirement of calling Remote's workFromHome()
		Remote ref = new Remote(){
			@Override
			public void workFromHome() {
				System.out.println("Wow!!!");
			}
		};
		ref.workFromHome();
	}

}
interface Remote{
	void workFromHome();
}

