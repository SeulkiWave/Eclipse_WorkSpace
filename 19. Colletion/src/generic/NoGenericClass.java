package generic;

public class NoGenericClass {
	
	private Object member; // member 객체가 모든 클래스를 받기 위해서는 root 클래스인 Object형이 되어야 한다~
	// 현존하는 모든 객체를 참조하기 위한 상위로의 auto Casting --> 귀찮다! 꺼낼 때마다 Casting! 귀찮다!
	
	
	
	
	// getter setter
	public Object getMember() { // 어떤 객체인지 모르니까 줄 때도.. .....
		return member; 
	}
	public void setMember(Object member) { // 이것두 상위 캐스팅~
		this.member = member;
	}
	
}
	