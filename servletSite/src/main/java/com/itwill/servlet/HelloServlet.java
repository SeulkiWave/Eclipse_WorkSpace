package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. javax.servlet.http.HttpServlet 클래스를 상속 받아야 한다.
public class HelloServlet extends HttpServlet {
	// 2. HttpServlet service 메소드를 Override 한다
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 2-1. 클라이언트에 전송할 데이터의 타입(종류)를 결정한다
		response.setContentType("text/plain;charset=UTF-8");
		
		// 2-2. 클라이언트에 데이터를 전송하기 위한 "출력 스트림"을 생성한다.
		PrintWriter out = response.getWriter();
		out.println("Hello Dynamic Resource 1!");
		out.println("Hello Dynamic Resource 2!");
		
	}
}
