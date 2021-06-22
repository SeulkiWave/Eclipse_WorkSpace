public class AcademyTeacher extends AcademyMember {
	
	public String subject;
	
	public AcademyTeacher() {}
	public AcademyTeacher(int num, String name, String subject) {
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
