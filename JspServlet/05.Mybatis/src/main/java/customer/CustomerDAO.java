package customer;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CustomerDAO {
	// 싱글톤(static{}블럭킹 만들어서 CustomerDAO가 사용될 때 무조건 먼저 실행될 코드 넣어둠)
	// Connection <- conn 열고 닫고 수동으로 함.
	// 외부에서 사용할 수 있는 (인스턴스멤버에서 SqlSession만 사용함.)
	private static SqlSession sql;
	static {
		String resource = "mybatis/conn.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sql = sqlSessionFactory.openSession(); // Connection객체를 이용해서 통신을 여는 처리
	}

	public void test() {
		//마이바티스 매퍼를 이용해 dual테이블로 숫자 1 가져오기.
		int result = sql.selectOne("lyj.dual");
		System.out.println(result);
	}

	public List<CustomerVO> listSelect() {
		// 마이바티스 매퍼 이용해 customer테이블 전체 내용 가져오기
		List<CustomerVO> list = sql.selectList("cu.list");
		System.out.println(list.size());
		return list;
	}
	
	public CustomerVO selectDetail(int id) {
		CustomerVO vo = sql.selectOne("cu.detail",id);
		System.out.println(vo.getName());
		return vo;
	}
	
	public void update(String id, String email, String phone) {
		CustomerVO vo = new CustomerVO();
		vo.setId(Integer.parseInt(id));
		vo.setEmail(email);
		vo.setPhone(phone);
		int result = sql.update("cu.update", vo);
		sql.commit();
		System.out.println(result);
	}
	
	public void insert(CustomerVO vo) {
		int result = sql.insert("cu.insert",vo);
		sql.commit();
		System.out.println(result);
	}
	
}