package DAO.Address.Third;

/*
VO(Value Object),DTO(Data Transfer Object)
  	- 회원 관리를 위하여 필요한 도메인 클래스(VO,DTO)
  	- 회원 객체 한명의 데이터를 가지고 있다.(VO)
  	- 회원 객체 한명의 데이터를 저장하기 위한 멤버 변수를 가지고 있다
  	- 회원 테이블과 동일한 속성column을 멤버 필드로 가지는 객체
  	
  	이름      널?       유형           
------- -------- ------------ 
NO      NOT NULL NUMBER(4)    
ID               VARCHAR2(20) 
NAME             VARCHAR2(50) 
PHONE            VARCHAR2(50) 
ADDRESS          VARCHAR2(60) 
  	
 */

public class Address {
	
	// Address Table column과 대응하는 멤버 필드(변수)를 만들기..
	private int num;
	private String id;
	private String name;
	private String phone;
	private String address;
	
	// Constructor
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(int num, String id, String name, String phone, String address) {
		this.num = num;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
