package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.CustomerDAO;
import customer.CustomerVO;


@WebServlet("*.cu") //하나의 요청씩 처리 /list.cu
					//특정 규칙을 가진 구분자의 모든 처리 (cu) : '/'(x), *.cu
public class CuController extends HttpServlet {
	RequestDispatcher rd;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mapping = req.getServletPath();
		CustomerDAO dao = new CustomerDAO();
		System.out.println(mapping);
		if(mapping.equals("/list.cu")) {
			List<CustomerVO> list = new CustomerDAO().listSelect();
			req.setAttribute("list", list);
			rd=req.getRequestDispatcher("customer/list.jsp");
			System.out.println("열림");
		}else if(mapping.equals("/detail.cu")) {
			//url또는 get post 방식으로 servlet으로 오는 모든 데이터는 parameter(String)
			//req (요청), response(응답)
			//req객체의 set&getAttribute, getParmeter
			//getParameter : jsp 또는 html페이지에서 servlet(back)요청(a태그 form url)
			//setAttribute, get : setvlet 동작을 하고 데이터를 전송
			int id = Integer.parseInt(req.getParameter("id"));
			req.setAttribute("vo", dao.selectDetail(id));
			rd=req.getRequestDispatcher("customer/detail.jsp");
		}else if(mapping.equals("/update.cu")) {
			String id=req.getParameter("id");
			String email=req.getParameter("email");
			String phone=req.getParameter("phone");
			dao.update(id, email, phone);
		}else if(mapping.equals("/insert.cu")) {
			rd=req.getRequestDispatcher("customer/insert.jsp");
		}else if(mapping.equals("/new.cu")) {
			System.out.println(req.getParameter("id"));
			CustomerVO vo=new CustomerVO();
			vo.setId(Integer.parseInt(req.getParameter("id")));
			vo.setName(req.getParameter("name"));
			vo.setEmail(req.getParameter("email"));
			vo.setPhone(req.getParameter("phone"));
			dao.insert(vo);
		}else {
			System.out.println("잘못됐다.");
		}
		rd.forward(req, resp);
	}

}
