package testsvl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;


@WebServlet("/Te")
public class TestServlet extends HttpServlet {
//url : 톰캣(localhost:portNumber(192.168.0.119:8080)/web project/mapping)
	// 192.168.0.119:8080/do/Te
	// 프로젝트 새로 만들 때 톰캣이 프로젝트를 인식할 수 있게 add&remove
	// HttpServletRequest : Request객체 톰캣에서 요청이 오면 모든 정보를 Request를 통해 담아 Java코드로 줌.(요청관련 기능)
	// HttpServletResponse : Request 객체로 요청 처리 받고 클라이언트(크롬)에 응답을 주기 위한 객체. 페이지 전환, 내용표시 등 크롬창 표시 기능
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("TestServlet이 호출되었습니다.");
		String param = req.getParameter("param");
		System.out.println("크롬을 통해 Get방식으로 param 정보가 들어옴"+param);
		
		
		if(param != null && param.equals("newPage")) {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, res);	
		}else {
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter writer = res.getWriter();
		writer.println("<html>");
		writer.println("<body>");		
		writer.println("<h1>응답객체로 페이지에 쓰기</h1>");		
		writer.println("</body>");
		writer.println("</html>");
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}

}
