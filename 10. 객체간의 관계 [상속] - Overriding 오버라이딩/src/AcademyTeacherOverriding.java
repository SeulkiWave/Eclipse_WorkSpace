public class AcademyTeacherOverriding extends AcademyMemberOverriding {
	
	public String subject;
	
	public AcademyTeacherOverriding() {}
	public AcademyTeacherOverriding(int num, String name, String subject) {
		this.num = num;
		this.name = name;
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.print(subject);
	}
	
	
	// Getter Setter
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
