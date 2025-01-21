package ex;

public class VariableEx4 {
//	main method : 자바 실행 구문
	public static void main(String[] args) {
		/*[상수(Constant]
		 * - 한번 값을 대입하면 바꿀 수 없는 변수
		 * 
		 * - 작성법
		 * 
		 * final 자료형 변수명 = 값;
		 * 
		 * 단, 변수명은 대문자 + _(underscore case) 
		 * */
		
		final double PI = 3.141592;
		final int NATIONAL_CODE = 82;
		
//		NATIONAL_CODE = 1;(오류발생, 대입불가)
		
//		Java에서 상수는 선언, 초기화 구문이 분리될 수 있음
		
		final int TEMP; //상수 선언
		
		TEMP = 100;	   //상수에 처음이자 마지막으로 값 대입(초기화)
		
//		TEMP = 200;   //처음 초기화 이후 값 대입 불가
		
		System.out.println("[상수 확인]");
		
		int r = 5; //반지름
		System.out.println("원의 둘레: " + (2*PI*r));
		System.out.println("원의 넓이: " + (PI*r*r));
		System.out.println("국가 코드: " + NATIONAL_CODE);
		System.out.println("TEMP: " + TEMP);
		
//		--------------------------------------------------------------------
	
		System.out.println("--------------------");
		System.out.println("오버플로우(overflow)");
		
//		오버 플로우
//		- 연산 결과가 자료형의 값의 범위를 초과(+)한 경우
//		언더 플로우
//		- 연산 결과가 자료형의 값의 범위를 초과(-)한 경우
		
		int num = Integer.MAX_VALUE; //int 최대값
		
		System.out.println("num : " + num);
		num=num+1; //overflow 발생
		
		System.out.println("num+1 : " + num);
		
		num=num-1; //underflow 발생
		System.out.println("num +1 -1 : " + num);
		
//		문제 원인 : num의 자료형이 int라서 최대/최소값을 초과하는 문제 발생
//		문제 해결 : num의 자료형을 long으로 변경
		
		
		
		
		
		
		
		
		
		
		
	}
}
