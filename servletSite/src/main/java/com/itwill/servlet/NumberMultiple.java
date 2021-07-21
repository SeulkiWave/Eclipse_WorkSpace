package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. javax.servlet.http.HttpServlet 클래스를 상속 받아야 한다.
public class NumberMultiple extends HttpServlet {
	// 2. HttpServlet service 메소드를 Override 한다
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 2-1. 클라이언트에 전송할 데이터의 타입(종류)를 결정한다
				response.setContentType("text/plain;charset=UTF-8");
				
				// 2-2. 클라이언트에 데이터를 전송하기 위한 출력 스트림을 생성한다.
				PrintWriter out = response.getWriter(); // 이거 왜 따로 만들어야 하지.. 왜 sysout으로는 안 되는걸까요 (system이 아니라서 그른가)
				int i = 0;
				int j = 0;
				for (i = 1; i <= 9; i++) {
					for (j = 1; j <= 9; j++) {
						out.print(j +"*"+ i + "="+ (i*j) +"\t"); // 이게 되네! 
					}
					out.println();
				}
				out.println("Print Finish - Number Multification"); // 이거 즉석으로 추가하니까 서버 재가동 안 해도 바로 적용이 된다 신기..
	}
}
