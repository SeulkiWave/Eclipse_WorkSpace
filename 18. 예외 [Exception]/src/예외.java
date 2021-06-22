/*
	예외: 실행시에 발생하는 에러
	  0. Throwable : 예외최상위클래스 
		 - The Throwable class is the superclass 
		   of all errors and exceptions in the Java language.
		 - Only objects that are instances of this class (or one of its subclasses) 
		   are thrown by the Java Virtual Machine 
		   or can be thrown by the Java throw statement. 
	  
	  1. Exception : MILD Error (처리대상)
	  2. Error     : Error
	  
	  
	  * Exception 종류
	   		1. RuntimeException: throw 구문으로 자동처리 (컴파일러가 에러를 발생시키지 않는다)
	   		    ==>프로그래머의 실수로인한 Exception 
	   		    ex> NullPointerException,ArrayIndexOutOfBoundsException
	   		    
	        2. 비 RuntimeException :반드시 처리해야한다.(컴파일러가 에러를 발생시킨다.)
	        	==> 프로그램과관계 없이 일어날 가능성이 있는 Exception
	  			ex> network, IO, DB, File
	  *처리방법
	     ex1> 잡는다.
	     public void method(){
		     try{
		     익셉션 발생예상코드;
			 }catch(Exception클래스 e){
			 	익셉션 발생예상코드에서 Exception이발생하면
			 	실행하게될코드;
			 }
		 }
		 ex2> 던진다.
		 	public void method()throws Exception {
		 		익셉션 발생예상코드;
		 	}	
	*/

public class 예외 {

}