package kr.gudi;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet : Main");
		getPara(req);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost");
		req.setCharacterEncoding("UTF-8");
		getPara(req);
	}
	
	void getPara(HttpServletRequest req) {
	Enumeration<String> N = req.getParameterNames();
	while (N.hasMoreElements()) {
		String PName = (String) N.nextElement();
		// key 이름을 뽑아내는 방법
		String V = req.getParameter(PName);
		// string 값으로 value만 가져오는방법
		System.out.println(PName + " : " + V);
		//Map 형식으로 출력
		}

	}
}
