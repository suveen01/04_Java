package staticmember;

public class StaticMemberRun {

	public static void main(String[] args) {
		
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		/* 아래있는 코드가 수행되기 전!!
		 * 이미 static이 붙은 멤버가 static 영역에 클래스명.필드명으로(Korean.nationalCode) 할당되어 있음!
		 */
		
		
		// korean 객체 2개 생성
		Korean k1 = new Korean("김철수", "051212-3456789");
		Korean k2 = new Korean("이미영", "050304-4567891");
		
		/*
		 *  // 국가 코드 세팅 k1.setNationalCode(82); k2.setNationalCode(82);
		 *  // Korean 객체가 생성될때 마다 세팅하기 불편. 
		 *  // -> Korean 클래스에 nationalCode 필드에 값을 명시적으로 초기(Korean.java 5번줄)
		 */		
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		
		// 만약 이미 생성된 모든 Korean 객체의 nationalCode를 수정 해야되는 경우
//		k1.setNationalCode(1);
//		k2.setNationalCode(1);
		// -> 생성된 모든 Korean 객체에 하나하나 접근해서 값 수정(5000만번 불가)
		// --> static을 이용해서 문자 해결!
		
		// static 변수 값을 변경
		// -> 모든 Korean 객체의 nationalCode가 일괄 변경
		Korean.nationalCode = 1000;
		
		System.out.println("------------------");
		System.out.println("Korean.nationalCode : " + Korean.nationalCode);
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		
		
		
		System.out.println("--------------------");
		System.out.println("[초기화 블럭 확인]");
		
		Korean k3 = new Korean();
		Korean k4 = new Korean();
		System.out.println(k3.toString());
		System.out.println(k4.toString());
		
		
		
	} //main
}	//StaticMemberRun
