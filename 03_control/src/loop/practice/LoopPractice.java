package loop.practice;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	/**
	 * 기능 제공용 클래스
	 */

//  실습문제1
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다.
//	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	public void practice1(){
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i<=num ; i++) {
			System.out.print(i+ " ");
		}
		if(num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		}
	}
	
//	실습문제2
//	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
//	단, 입력한 수는 1보다 크거나 같아야 합니다
	
	 public void practice2(){
		 System.out.print("1 이상의 숫자를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num >=1) {
			 for(int i = num ; i>=1 ; i--) {
				 System.out.print(i+ " ");
			 }
		 }
	 }
// 	실습문제3	
// 	1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

	     public void practice3() {


	         // 사용자로부터 숫자 입력 받기
	         System.out.print("정수를 하나 입력하세요: ");
	         int num = sc.nextInt();

	         // 합을 저장할 변수 초기화
	         int total = 0;

	         // 결과 출력 준비
	         System.out.print("1");

	         for (int i = 2; i <= num; i++) {
	             System.out.print(" + " + i); // 과정 출력
	             total += i; // 합 계산
	         }

	         // 마지막 숫자 포함한 합 계산
	         total += 1;

	         // 결과 출력
	         System.out.println(" = " + total);
	     }



	 
	 	
//	 	실습문제4
//	 	사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//	 	만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요
	 	
	  public void practice4(){
	  	
	  	System.out.print("첫 번째 숫자 : ");
	  	int num1 = sc.nextInt();
	  	
	  	System.out.print("두 번째 숫자 : ");
	  	int num2 = sc.nextInt();
	  	if(num1< 1 || num2 < 1) {
				System.out.print("1 이상의 숫자를 입력해주세요.");
				return;
			}
	  	
			if(num1>num2) {
				int temp = num2;
				num2 = num1;
				num1 = temp;
				}
			for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
	  }

	
// 		실습문제 5
//		사용자로부터 입력 받은 숫자의 단을 출력하세요. 
	  public void practice5(){
	  	
	  	System.out.print("숫자 : ");
	  	int num = sc.nextInt();
	  	System.out.printf("===== %d 단 =====", num);
	  	System.out.println();
	  	
			for(int i = 1 ; i <= 9 ; i++) {
				
				System.out.printf("%2d * %2d = %2d\n",num, i, num*i);
			}
		}

//	  실습문제6
//	  사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//	  단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
	  public void practice6(){
	  
	  	System.out.print("숫자 : ");
	  		int num = sc.nextInt();
	  if(num > 9 || num < 2) {
	  	System.out.println("2~9 사이 숫자만 입력해주세요.");
	  	return;
	  }
		
		for(int dan = num ; dan <= 9 ; dan++) {
			
		System.out.printf("\n===== [%d단] =====\n", dan);		
		
		//구구단 출력
		for(int i = 1 ; i <= 9 ; i++) {
		System.out.printf("%2d x %2d = %2d\n", dan, i, dan*i);
		}
			}
	  
	  }  
	  
	  
//	  실습문제 7 
//	  다음과 같은 실행 예제를 구현하세요.
	  
	  public void practice7(){

	  	System.out.print("정수 입력 : ");
	  	int num = sc.nextInt();
			for (int i = 1 ; i <= num ; i++ )
			{
				for (int j = 1; j <= i ; j++ )
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}

//	 실습문제8
//	 다음과 같은 실행 예제를 구현하세요
	  
	  
	  public void practice8(){
	  	System.out.print("정수 입력 : ");
	  	int num = sc.nextInt();
	  	for (int i = num; i >= 1 ; i-- ) {
				for (int j = 1 ; j <= i ; j++ )
				{ System.out.print("*");
						
				} System.out.println();
			}
		}
	  
//	 실습문제9
//	 다음과 같은 실행 예제를 구현하세요               
	   public void practice9(){
	  	 
	  	 
	 	  System.out.print("정수 입력 : ");
	 	  int num = sc.nextInt();
	  	  for (int i = 1 ; i <= num ; i++ ) {
	 			for (int j = 1 ; j <= num-i; j++ )
	 			{
	 				System.out.print(" ");		
	 			}	
	 			for (int k = 1; k <= i; k++ )
	 			{
	 				System.out.print("*");
	 			}
	 			System.out.println();
	 		}
	}
//	   강사님 풀이
//	  	System.out.print("정수 입력 : ");
//	  	int input = sc.nextInt();
//			for (int row = 1 ; row <= input ; row++ ){
//				
//				for(int blank = 1 ; blank <= input-row ; blank++) {
//					System.out.print(" ");
//				}
//				for (int col = 1; col <= row ; col++ )
//				{
//					System.out.print("*");
//				}
//				System.out.println();
//			}
	   

	   
	   
	   
//	 실습문제10
//	 다음과 같은 실행 예제를 구현하세요 
	   
	   public void practice10(){
	  
	  	 System.out.print("정수 입력 : ");
//		 	  int num = sc.nextInt();
	   for(int i = 1; i < 10 ; i++) {
	  	 int k;
	  	 if(i < 5) {
	  		 k=i;
	  	 }	else {
	  		 k=10-i;
	  	 }
	  	 for(int j=0 ; j<k ; j++) {
	  		 System.out.print("*");
	  	 }
	  	 System.out.println();
	   } 
	  	 
	  	 
	  	 
	  	 
	   }


//	 실습문제11
//	 다음과 같은 실행 예제를 구현하세요 
	   public void practice11(){

	  	System.out.print("정수 입력 : ");
	  	int input = sc.nextInt();
			for (int row = 1 ; row <= input ; row++ ){
				
				for(int blank = 1 ; blank <= input-row ; blank++) {
					System.out.print(" ");
				}
				for (int col = 1; col <= 2* row - 1 ; col++ )
				{
					System.out.print("*");
				}
				System.out.println();
			}
	  	 
	   }
	  
	   
//	 실습문제12
//	 다음과 같은 실행 예제를 구현하세요
	   public void practice12(){
	  	 
	  	 System.out.print("정수 입력 : ");
		 	  int input = sc.nextInt();
		 	  
		 	  for(int row=1 ; row<=input ; row++) {
		 	  	for(int col=1 ; col<input ; col++) {
		 	  		if(row == 1 || row == input || col == 1 || col == input) {
		 	  			System.out.print("*");
		 	  		}else {
				 	  	System.out.println();
		 	  		}
		 	  	}
		 	  	System.out.println();		//줄바꿈
		 	  }
	   }	 	  
	  	 
	  	 
	  	 
	   
	   
	   
//	 실습문제13
//	 1부터 사용자에게 입력 받은 수까지 중에서
//	 1) 2와 3의 배수를 모두 출력하고
//   2) 2와 3의 공배수의 개수를 출력하세요.

	   public void practice13() {
	     
	     System.out.print("자연수 하나를 입력하세요 : ");
	     int num = sc.nextInt();

	     int count = 0; // 2와 3의 공배수의 개수

	     System.out.print("2와 3의 배수: ");
	     for (int i = 1; i <= num; i++) {
	         if (i % 2 == 0 || i % 3 == 0) { // 2 또는 3의 배수인 경우
	             System.out.print(i + " ");
	         }
	         if (i % 2 == 0 && i % 3 == 0) { // 2와 3의 공배수인 경우
	             count++;
	         }
	     }
	     System.out.println();
	     System.out.println("2와 3의 공배수의 개수: " + count);
	 }
//	  실습문제14
//	  사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//	  단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
  
	    public void practice14(){
	    	
	    System.out.print("숫자 : ");
	    int num = sc.nextInt();
	    
	    for(int i=1 ; i<=num ; i++ ) {
	    	if(num % i == 0) {
	    		
	    	}
	    }
	    	
	    	
	    	
	    	
	    }
	  
	  
	  
//	  실습문제15
//	  위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
//	  “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
	  
	    public void practice15(){}
	  
	    
//	  실습문제16
//	  2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//	  단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
	    
	    public void practice16() {
	    	
	    	System.out.println("숫자 : ");
	    	int num = sc.nextInt();
	    	
	    	int count = 0; // 소수의 개수를 count 하기 위한 변수
	    	
	    	for(int i=2 ; i<num ; i++) {
	    		
	    		boolean flag = true; // flag=깃발(신호용도)
	    		//true인 경우 : 소수0
	    		//false인 경우 : 소수x
	    		
	    		// 1과 자기 자신(num)을 뺀 정수를 한개씩 접근
	    		for(int x=2 ; x<i ; x++) {
	    			
	    			if(i % x == 0) {	//1,자기 자신 빼고 나누어 떨어지는 수 존재
	    				flag = false;
	    				break;
	    			}
	    		}
	    		
	    		if(flag) {
	    			System.out.print(i + " ");
	    			count++;
	    		}
	    	}
	    System.out.printf("\n2부터 %d까지 소수의 개수는 %d개 입니다\n : ", num, count);
	    	
	    	
	    }
	    
















}
	    
	    

	   
	    	
	  
	  
	  
	  
	  
	  
	  
	

