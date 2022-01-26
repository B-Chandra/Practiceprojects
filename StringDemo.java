
public class StringDemo {
	public static void main(String[] args) {

		Learner theLearner = new Learner("Mukesh", "FSD");

		Learner anotherLearner = new Learner("Nandini", "UI");

		System.out.println(theLearner);
//		
		System.out.println(anotherLearner);

//		System.out.println("Welcome " + theLearner.name() + ", your" + "domain is " + theLearner.domain());

//		or with Java 15 text-blocks
//		System.out.println("""
//				Welcome Anand
//					how are you doing?
//				Hows the training going on?
//				""");
	}

}

//The modern Java 16 succinct way : records

record Learner(String name, String domain) {
}

//Tradional way of creating Java Beans
//class Learner{
//	private String name;
//	private String domain;
//	
//	
//	
//	
//	@Override
//	public String toString() {
//		return "Learner [name=" + name + ", domain=" + domain + "]";
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDomain() {
//		return domain;
//	}
//	public void setDomain(String domain) {
//		this.domain = domain;
//	}
//	public Learner(String name, String domain) {
//		super();
//		this.name = name;
//		this.domain = domain;
//	}
//	
//	public Learner() {
//		// TODO Auto-generated constructor stub
//	}

