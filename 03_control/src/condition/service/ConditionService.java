package condition.service;

import java.util.Scanner;
public class ConditionService {
	/**
	 * 기능(예제, 연습문제) 제공용 클래스
	 */
//	필드(field) == 멤버 변수 == 인스턴스 변수
//	해당 클래스(객체) 내에서 언제, 어디서든지 사용 가능한 변수
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 1~10 사이 난수(정수)가 짝수인지 홀수인지 검사 
	 *	
	 */
	public void method1() {
//		Math.random() : 0.0 이상 1.0 미만 난수 발생
		int randomNumber = (int)(Math.random() * 10 + 1);
		
//	2로 나눴을 때 나머지가 0인지 아닌지 결과를 저장
//	== 0이면 짝수(true), 1이면 홀수(false)
		boolean result = randomNumber % 2 == 0;
		System.out.println("randomNumber : " + randomNumber);
//	조건식 : 결과가 true 또는 false가 되는 식
		if(result) { // true인 경우
			System.out.println("짝수입니다.");
		} else {	//false인 경우
			System.out.println("홀수입니다.");
		}
	}
	
	/**
	 * 나이를 입력 받아 "어린이", "청소년", "성인" 구분
	 * 
	 *  <pre>
	 *  13세 이하 "어린이"
	 *  13세 초과 19세 이하 "청소년"
	 *  19세 초과 "성인"
	 *  </pre>
	 * 
	 */
	public void method2() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
//	if - else if - else 이용
		String result;
		
		if(age > 19) {
			result = "성인";
			
		} else if(age >13) {
			result = "청소년";

		} else {
			result = "어린이";
		}
		System.out.print(result);
	}

	/**
	 * 나이를 입력 받아 구분하기
	 * 
	 * <pre>
	 * 13세 이하 "어린이"
	 * 13세 초과 19세 이하 중
	 * - 14~16세 : 청소년(중)
	 * - 17~19세 : 청소년(고)
	 * 19세 초과 : "성인"
	 * 0미만 100 이상 "잘못 입력하셨습니다"
	 * </pre>
	 */
	public void method3() {
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		
		String result;
		if(age < 0 || age >= 100) {
			System.out.println("값을 잘못 입력하셨습니다");
			return; //메서드(함수)를 종료하고 호출한 곳으로 돌아감
		}
		
		if(age > 19) {
			result = "성인";
			
		} else if(age >13) {
			result = "청소년" + (age <= 16 ? "(중)" : "(고)");

		} else {
			result = "어린이";
		}
		System.out.print(result);
	}

	
	// ---------------------------------------------------------
	
	/*
	 * Switch - case - default 
	 */
	
	/**
	 * ConditionService 에 작성된 메서드를 골라서 실행하는 메서드
	 */
	public void displayMenu() {
		
		System.out.println("1. method1()");
		System.out.println("2. method2()");
		System.out.println("3. method3()");
		System.out.println("4. method4()");
		System.out.print("매뉴 번호 입력 >>");
		int input = sc.nextInt();
		
		switch(input){
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 4 : method4(); break;
			default : System.out.println("없는 메뉴 번호 입니다.");
		}
	}
	
	
	public void method4(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[성적 판별기]");
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("중간고사 점수(40%) : ");
		int me = sc.nextInt();
		System.out.print("기말고사 점수(50%) : ");
		int fe = sc.nextInt();
		System.out.print("과제 점수(10%) : ");
		int pa = sc.nextInt();

		System.out.println();
		double result1;
		result1 = ((me*0.4) + (fe*0.5) + (pa*0.1));
		System.out.println(name + "의 최종 점수 : " + result1);

		String result2;
		
		if(result1 >= 95) {
			result2 = "A+";
			
		} else if(result1 >= 90) {
			result2 = "A";

		}else if(result1 >= 85) {
			result2 = "B+";

		}else if(result1 >= 80) {
			result2 = "B";

		}else if(result1 >= 75) {
			result2 = "C+";

		}else if(result1 >= 70) {
			result2 = "C";

		}else if(result1 >= 65) {
			result2 = "D+";

		}else if(result1 >= 60) {
			result2 = "D";

		} else {
			result2 = "F";
		}
		System.out.println("성적 : " + result2);
	}		

}



	

