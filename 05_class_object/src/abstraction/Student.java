package abstraction;

//	class : 객체의 멤버(필드, 메서드)를 정의 한 문서( == 설계도)
public class Student {
	/* 추상화(Abstraction)란?
	 * - 객체의 공통점을 추출하고, 불필요한 부분을 제거하여 유연성을 확보하는 것
	 */
	
	
	/* 필드 == 멤버 변수 */
	
	// private 접근 제한자 - 외부 직접 접근 제한(캡슐화 원칙)
	private String studentNumber; // 학번
	private String name;         	// 이름
	private int html; 							// html 점수
	private int css; 							// css 점수
	private int js; 								// js 점수
	private int java; 							// java 점수
	
	
	
	/* 생성자
	 * 	- 객체가 생성될 때 수행할 명령어를 작성한 특수한 메서드
	 *  - 객체 생성 시 1회만 수행
	 *  
	 *  [작성법]
	 *  접근제어자 클래스명(){	
	 *  
	 *  - 반환형 없음
	 *  - 이름은 클래스명과 동일해야함
	 *  
	 *  }
	 */
	
	/* 기본 생성자
	 *  - 매개변수가 없는 생성자
	 *  - 클래스 내에 생성자가 1개도 없으면 컴파일러가 자동으로 추가해준다.
	 *  -> public 클래스명(){}
	 *  
	 */
	
	public Student() {
		// 생성자 만듦
		
		System.out.println("Student 객체가 기본생성자로 생성되었습니다.");
		
		// 객체가 heap 영역에 생성될 때
		// 필드 값이 모두 JVM 초기값으로 세팅이 진행됨
		// (heap 영역은 비어있는 상태로 존재 불가)
		// - 정수형 :0, 실수형 : 0.0, 논리형 : false, 문자형 : '\u0000' 참조형 : null(참조하는 객체가 없다, 저장된 주소가 없다)
		
		/*	생성자를 이용해서 객체가 생성될 때 필드값을 원하는 값으로 초기화 할 수 있다.
		 */
		
		studentNumber = "2025xxxx";
		name = "미입력";
		html = 100;
	  css  = 100;
	  js = 100;
	  java = 100;
	}
	
//	Duplicate method Student() in type Student 오류 발생(중복)
	/* 매개 변수가 있는 생성자(String 2개) */
	public Student(String studentNumber, String name) { 
		System.out.println("--Student(String, String) 생성자로 객체 생성 --");
		
		// 생성되는 객체의 필드 초기화
		this.studentNumber = studentNumber;
		this.name = name;
	}
	
	/* 매개 변수가 있는 생성자(모든 필드 초기화) */
	public Student(String studentNumber, String name,
			int html, int css, int js, int java) {
		
		System.out.println("-- 모든 필드를 초기화하는 생성자로 객체 생성 -- ");
		
		this.studentNumber = studentNumber;
		this.name = name;
		this.html = html;
		this.css = css;
		this.js = js;
		this.java = java;
		
	}
	
	
	/* <오버로딩(overloading, 과적)>
	 * - 하나의 클래스 내에 같은 이름의 메서드를 여러개 작성하는 기술
	 * - 같은 이름의 메서드는 원래 하나만 존재할 수 있지만
	 *   매개변수(순서, 타입, 개수)를 다르게 하여
	 * 	 같은 이름의 메서드라도 구분할 수 있게 된다.
	 * */

	
	
	
	
	
	/* 메서드 == 객체의 기능(함수)
	 * 
	 * 접근제어자 반환형 메서드명([매개변수]){
	 *	//메서드 정의
	 *	[return값;]
	 * }
	 */
	
	// 직접 접근이 제한된 필드에 간접 접근하는 방법을 제공하는 메서드
	// (getter/setter)
	
	// getter : 객체의 필드 값을 얻어가게 만드는 메서드
	// public 반환형 get필드명(){ return 필드명; }
	public String getName(){
		return name;
	} // getName
	
	public String getStudent(){
		return studentNumber;
	} // getStudentNumber
	
	public int getHtml(){
		return html;
	} // getHtml
	
	public int getCss(){
		return css;
	} // getCss
	
	public int getJs(){
		return js;
	} // getJs
	
	public int getJava(){
		return java;
	} // getJava
	
	// setter : 외부에서 전달받은 값을 객체의 필드에  세팅하는 메서드
	
	
// public void set필드명(매개변수){
//		this.필드명 = 매개변수명;
//}
	
 /* this 참조 변수 : 생성된 객체를 참조한느 변수(현재 객체) */
	
	public void setName(String name) {
		/*필드*/ this.name=name;	/*매개변수*/
	}	//setName
	
	public void setStudentNumber(String studentNumber) {
		/*필드*/ this.studentNumber=studentNumber;	/*매개변수*/
	}	//setStudentNumber
	
	public void setHtml(int html) {
		/*필드*/ this.html=html;	/*매개변수*/
	}	//setHtml
	
	public void setCss(int css) {
		/*필드*/ this.css=css;	/*매개변수*/
	}	//setCss
	
	public void setJs(int js) {
		/*필드*/ this.js=js;	/*매개변수*/
	}	//setJs
	
	public void setJava(int java) {
		/*필드*/ this.java=java;	/*매개변수*/
	}	//setJava
	
	
//	성적 합계 계산해서 반환하는 메서드
		
	public int getSum() {
		return html + css + js + java;
		
	} //getSum
	
	// 평균 반환 메서드
	
	public double getAverage() {
		return getSum() / 4.0 ; //합계 / 개수
		
	}	//getAverage
	
	// 학생의 성적 정보를 문자열 형태로 반환
	
	public String tostring() { // toString : 이 객체를 문자열로 표현하겠다.
		
		/* [반환형]
		 *  String String.format("템플릿(패턴)" , 패턴에 대입될 값)
		 * 	- 지정된 형식의 문자열을 만드는 메서드
		 * 	- System.out.printf() 처럼 작성하지만 출력되지 않고 String으로 반환 
		 * 
		 */
		String str 
			= String.format(
					"[%s] %s\n "
					+ "HTML : %d / Css : %d / JS : %d / Java : %d\n "
					+ "합계 : %d\n "
					+ "평균 : %.2f"
					, studentNumber, name,
						html, css, js, java,
						getSum(), getAverage());
		
		return str; // 만들어진 문자열 반환
	} //tostring
	
	

	
	
 
	
	
	
	
	
	
	
	
	
} //Student
