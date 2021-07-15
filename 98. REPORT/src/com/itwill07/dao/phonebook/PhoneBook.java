package com.itwill07.dao.phonebook;

/*
  이름    널?       유형           
----- -------- ------------ 
NO    NOT NULL NUMBER(4)    
NAME           VARCHAR2(50) 
PHONE          VARCHAR2(50) 
 */

public class PhoneBook {
	// MemberField
	private int num;
	private String name;
	private String phone;
	// Constructor
	public PhoneBook() {}
	public PhoneBook(int num, String name, String phone) {
		this.num = num; // PK
		this.name = name;
		this.phone = phone;
	}
	// Getter, Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
	
}