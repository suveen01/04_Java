package section01;

public class section01Run {

	public static void main(String[] args) {
		// 부모 객체 생성
		Parent p1 = new Parent();
		System.out.println("Parent의 toString() : " + p1.toString());
		System.out.println("-------------------------------------------");
		
		// child1 객체 생성
		Child1 c1 = new Child1();
		System.out.println("Child1의 toString() : " + c1.toString());
		System.out.println("Child1 만의 필드 laptop : " + c1.getLaptop());
	
		
		System.out.println("-------------------------------------------");
		
		// child2 객체 생성
		Child2 c2 = new Child2();
		System.out.println("Child2의 toString() : " + c2.toString());
		System.out.println("Child2 만의 필드 car : " + c2.getCar());
		
		
		System.out.println("-------------------------------------------");
		
		// child3 객체 생성
		Child3 c3 = new Child3();
		System.out.println("Child3의 toString() : " + c3.toString());
		System.out.println("Child3 만의 필드 bitCoin : " + c3.getBitCoin());
	}
}
