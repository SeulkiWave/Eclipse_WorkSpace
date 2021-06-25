package generic;

public class GenericClass<T> { // T로 타입이 들어온다~ 정해두지 않으면 Object~
	
	private T member; // 안에 선언된 Object를 밖의 클래스로 받고 싶을 때 사용하는 generic~
	
	
	
	// Getter Setter
	public T getMember() {
		return member;
	}
	public void setMember(T member) {
		this.member = member;
	}
	
}
