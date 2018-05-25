package mc1501home_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/signupStatusServlet")
public class signupStatusServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//contents type 결정
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		final char SPACE_BAR = ' ';
		
		HashMap<String, String> protocol = new HashMap<>();
		protocol.put("10", "경기도");
		protocol.put("20", "전라도");
		protocol.put("30", "경상도");
		protocol.put("100", "수영");
		protocol.put("200", "음악감상");
		protocol.put("300", "공부");
		
		//1. addr
			//
		String addrName = protocol.get(request.getParameter("addr"));
		
		//2. hobbies
			//복수개 선택이 가능한 hobbies를 하나의 string에 저장.
		StringBuffer hobbies = new StringBuffer();
		for(String hobbyKey : request.getParameterValues("hobbies")) {
				//key값으로 전달된 hobby를 실제 값(수영, 음악감상 등)으로 변경
			String hobbyName = protocol.get(hobbyKey);
			hobbies.append(hobbyName);
			hobbies.append(SPACE_BAR);
		}
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>signup Status</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<h2>input Email			: "+ request.getParameter("email") + "</h2>\r\n" + 
				"<h2>input Email Check	: "+ request.getParameter("emailCheck") + "</h2>\r\n" + 
				"<div></div>\r\n" + 
				"<h2>input Password		: "+ request.getParameter("password") + "</h2>\r\n" + 
				"<h2>input Password Check: "+ request.getParameter("passwordCheck") + " </h2>\r\n" + 
				"<div></div>\r\n" + 
				"<h2>input Name 			: "+ request.getParameter("name") + "</h2>\r\n" + 
				"<h2>input Birthday 		: "+ request.getParameter("birthday") + " </h2>\r\n" + 
				"<h2>input Tel 			: "+ request.getParameter("telNum") + "</h2>\r\n" + 
				"<h2>input Address 		: "+ addrName + "</h2>\r\n" + 
				"<h2>input Hobby			: "+ hobbies + "</h2>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
}
