/*
	* 1.Test 클래스생성
	* 		a. 클래스 이름 Test'
	*   	b. Test클래스에 3개의 멤버필드 작성'
	*      c. Test클래스에 3개의 멤버메쏘드 작성
	*         - 메쏘드안에는 System.out.println("xx메쏘드실행"); 기술 '
	* 2.TestMain 클래스 생성 
	*      a. TestMain 클래스에 main메쏘드 생성 '
	*      	- Test클래스객체생성'
	*      	- Test객체 멤버필드에0값대입
	*      	- Test객체 멤버메쏘드호출
	* 3.객체그림상상하시고 주실행흐름 파악
	*    (잘안되면 그리그리기)
*/

package com.itwill01.method;

public class TestMain {
	
	public static void main(String[] args) {
		
		Test test1= new Test();
		Test test2= new Test();
		
		test1.setNum(1, 2, 3);
		test2.setNum(4, 5, 6);
		
		test1.print1();
		test1.print2();
		test1.print3();
		
		test2.print1();
		test2.print2();
		test2.print3();
	}

}
