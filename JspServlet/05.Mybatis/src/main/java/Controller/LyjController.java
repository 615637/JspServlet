package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lym.lyjVO;


@WebServlet("*.lyj")
public class LyjController extends HttpServlet {
	RequestDispatcher rd;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("실행");
		if(req.getServletPath().equals("/list.lyj")) {
			ArrayList<lyjVO> list = new ArrayList<>();
			for(int i=0; i<10; i++) {
				lyjVO vo = new lyjVO();
				vo.setField1("필드"+i);
				vo.setField2(10+i);
				list.add(vo);	
			}
			req.setAttribute("list", list);
			rd=req.getRequestDispatcher("lyj/list.jsp");
		
		
		
		
		
		}else {
			System.out.println("망함");
		}
		rd.forward(req, resp);
	}
	
}
