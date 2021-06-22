public class AcademyStaff extends AcademyMember {
	
	public String depart;
	
	public AcademyStaff() {}
	public AcademyStaff(int num, String name, String depart) {
		this.num = num;
		this.name = name;
		this.depart = depart;
	}
	
	public void print() {
		super.print();
		System.out.print(this.depart);
	}
	
	// Getter Setter
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
