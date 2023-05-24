package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.driver.OracleDriver;

/**
 * Servlet implementation class JstlController
 */
@WebServlet("*.js")
public class JstlController extends HttpServlet {
	//doGet, doPost 두 가지가 합쳐진 버전의 메소드
	//service(get, post의 모든 요청을 받음)
	RequestDispatcher rd;
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getServletPath());
		if(req.getServletPath().equals("/list.js")) {
			req.setAttribute("key", "값"); //forward로 요청을 넘길 때는 setAttribute를 통해 데이터 전달.
			req.setAttribute("key1", "1");
			req.setAttribute("key2", "2");
			req.setAttribute("key3", "3");
			req.setAttribute("hi1", "빛나야");
			req.setAttribute("hi2", "안녕?");
			req.setAttribute("hi3", "반가워");
			rd=req.getRequestDispatcher("jstl/list.jsp"); //jsp, html페이지 경로 써줌
			//Model(MVC M) : DAO DTO를 다음페이지로 넘겨주고 요청을 맡김.
		}else if(req.getServletPath().equals("/listdetail.js")){
			System.out.println("리퀘스트로부터 요청받은 파라미터"+req.getParameter("q_bbsCode"));
			System.out.println("조회할 때, list.jsp=>listdetail로 갈 때");
			System.out.println("게시글 번호 : select를 하기 위해서");
			req.setAttribute("selectOne", "글의 상세 정보"+req.getParameter("q_bbsCode"));
			
			ArrayList<String> list = new ArrayList<>();
			for(int i = 0 ; i < 10 ; i ++) {				
				list.add("A"+i);
			}
			req.setAttribute("strList", list);
			
			rd=req.getRequestDispatcher("jstl/listdetail.jsp");
		
		}else {
			rd=req.getRequestDispatcher("error/list.jsp"); //나중에 추가예정(20230523) ->20230526
		}
		
		rd.forward(req, resp); //jsp페이지로 모든 정보 넘기고 처리 떠맡김
	}
	
}
