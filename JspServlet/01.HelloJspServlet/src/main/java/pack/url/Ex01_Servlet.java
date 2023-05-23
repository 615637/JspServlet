package pack.url;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01_Servlet
 */
//@Override, @~~ 기계가 인식하는 주석(Annotation) : 해당 클래스나 메소드의 기능 함축
@WebServlet("/Ex01_Servlet") //controller
public class Ex01_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Ex01_Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //form(폼 태그 내부에 있는 내용을 변수형태로 바꿔서 url로 요청하는 처리를 함.(제출, 전송)
    //form태그의 get method를 의미 get : 
    						//post : 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("사용자가 url을 통해 요청이 오면 여기 메소드가 실행됨");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
