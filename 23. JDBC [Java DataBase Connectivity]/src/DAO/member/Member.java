package DAO.member;

import java.util.Date;

/*
 * ValueObject, DataTransferObject
 * 		- 한 개의 주소 객체 데이터를 가지고 있는 VO
 * 		- 한 개의 주소 객체 데이터를 이동시키기 위한 객체 DTO (파라미터, 리턴 값 등)
 * 		- member 테이블과 동일한 속성attribute, column을 멤버 변수로 가지기 위한 객체
 * 
이름         널?       유형            
---------- -------- ------------- 
MEMID      NOT NULL VARCHAR2(20)  
MEMPW               VARCHAR2(30)  
MEMNAME             VARCHAR2(50)  
MEMADDRESS          VARCHAR2(100) 
MEMAGE              NUMBER(3)     
MEMMARRIED          CHAR(1)       
MEMRDATE            DATE 
 */

public class Member { // 이 자체가 DTO가 된다..
	// member field
	private String memID;
	private String memPW;
	private String memName;
	private String memAddress;
	private int memAge;
	private String memMarried;
	private Date memRDate;
	
	// constructor
	public Member() {}
	public Member(String memID, String memPW, String memName, String memAddress, int memAge, String memMarried,
			Date memRDate) {
		this.memID = memID;
		this.memPW = memPW;
		this.memName = memName;
		this.memAddress = memAddress;
		this.memAge = memAge;
		this.memMarried = memMarried;
		this.memRDate = memRDate;
	}
	
	// Getter Setter
	public String getMemID() {
		return memID;
	}
	public void setMemID(String memID) {
		this.memID = memID;
	}
	public String getMemPW() {
		return memPW;
	}
	public void setMemPW(String memPW) {
		this.memPW = memPW;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemAddress() {
		return memAddress;
	}
	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
	public int getMemAge() {
		return memAge;
	}
	public void setMemAge(int memAge) {
		this.memAge = memAge;
	}
	public String getMemMarried() {
		return memMarried;
	}
	public void setMemMarried(String memMarried) {
		this.memMarried = memMarried;
	}
	public Date getMemRDate() {
		return memRDate;
	}
	public void setMemRDate(Date memRDate) {
		this.memRDate = memRDate;
	}
	
	// ToString
	@Override
	public String toString() {
		return "Member [memID=" + memID + ", memName=" + memName + ", memAddress=" + memAddress + ", memAge=" + memAge
				+ ", memRDate=" + memRDate + "]";
	}
	
	
}
