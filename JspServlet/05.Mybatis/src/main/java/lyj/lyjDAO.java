package lyj;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import customer.CustomerVO;

public class lyjDAO {
	public void test() {
		String resource = "mybatis/conn.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		try (SqlSession session = sqlSessionFactory.openSession()) {
			// session.method(.insert, update, delete, selectOne, selectList)
			// selectOne.selectList
			// 데이터 한 건, 여러 건 조회
			// selectOne("")=>parameter(statement)
			// mapper namespace.id
//			List<lyjVO> voList = session.selectList("lyj.listselect");
//			System.out.println("리스트 사이즈 :" + voList.size());
			//$, #
			//$ 표시는 ex)vo를 파라메터로 넘기면 vo에 값을 그대로 출력(조건으로 사용)
			//			where id = field1 (x) field1이라는 컬럼이 없어서 오류
			//# 표시는 데이터 타입에 맞춰서 처리가 됨
			//			where id = 'field1' (o) 값 비교이기 때문에 오류 안남
			//파라미터는 어떤 타입이든 상관 없지만 하나만 전송이 가능함. (parameter object)
			//변수를 여러개 가지고 있는 클래스를 만든다. (구조가 DB와 같은것 ==>VO, DTO활용)
			
//			String data=session.selectOne("lyj.selectwhere1", 101);
//			System.out.println(data);
//			CustomerVO vo = new CustomerVO();
//			vo.setId(103);
//			vo.setName("홍길동");
//			List<CustomerVO> list=session.selectList("lyj.selectwhere3");
//			System.out.println(list);
//			for(CustomerVO vo : list) {
//				System.out.println(vo.getId() + vo.getName() + vo.getEmail());
//			}
			//VO를 가지고 있지 않은 경우,
			HashMap<String, Object> params = new HashMap<>();
			params.put("ID", 103);
			params.put("NAME", "홍길동");
			String userName = session.selectOne("lyj.mapselect",params);
			System.out.println(userName);
			
		}
	}

}
//int dualInt = session.selectOne("Kym.dual");//Kym.dual
//session.method(-> .insert , update , delete , selectOne , selectList )
//selectOne . selectList
//데이터 한건 , 여러건 조회
//selectOne("")=> parameter ( statement ) 
//mapper namespace.id
//System.out.println("mybatis를 통해 select : " + dualInt);
//vo : getter & setter를 만들면 자동으로 되는것은 bean(Spring 객체 만들때만 사용됨)
//KymVO vo = session.selectOne("kym.voselect");
//System.out.println("==");
//List<KymVO> voList = session.selectList("kym.listselect");
//System.out.println("리스트 사이즈 : " + voList.size());

//파라메터의 전송은 단 하나의 객체만 가능하다 => String , int , ArrayList,HashMap..

//메소드가 같은이름으로 여러개 정의된것 : 메소드 오버 , '로딩'? 라이딩?
// $ , # <= 
// $ 표시는 ex) vo를 파라메터로 넘기면 vo에 값을 그대로 출력(조건으로 사용)
//         where id = field1 (x) field1이라는 컬럼이 없기때문에 오류
// # 표시는 데이터 타입에 맞춰서 처리가 된다. 
//			where id = 'field1' (o) 값 비교이기때문에 오류 x

// 파라메터는 어떤타입이든 상관없지만 하나만 전송할수있음.(Parameter Object)
// 변수를 여러개 가지고있는 클래스를 만든다(구조가 DB와같은것==>VO,DTO 활용)
//String data = session.selectOne("kym.selectwhere1", 1);
//System.out.println(data);
//Customer VO 만들기 <- 
//CustomerVO vo = new CustomerVO();
//vo.setId(1);
//vo.setName("NAME");
