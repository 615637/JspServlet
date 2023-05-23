package lym;

//@Data 만 쓰면 내부에 생성자, getter&setter가 있다고 자동 인식(lombok)
public class lyjVO {

	private String field1;
	private int field2;
	
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	public int getField2() {
		return field2;
	}
	public void setField2(int field2) {
		this.field2 = field2;
	}
	
	
	
}
