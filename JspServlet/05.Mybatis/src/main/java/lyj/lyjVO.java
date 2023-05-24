package lyj;

//@Data 만 쓰면 내부에 생성자, getter&setter가 있다고 자동 인식(lombok)
public class lyjVO {

	private String field1;
	private int field2;
	public lyjVO(String field1, int field2) {
		super();
		this.field1 = field1;
		this.field2 = field2;
	}
	
	
	
	
	
}
