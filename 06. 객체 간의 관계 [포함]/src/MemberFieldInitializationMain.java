
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
		
		MemberField mf1 = new MemberField();
		
		{
			System.out.println(mf1.member1);
			System.out.println(mf1.member2);
			System.out.println(mf1.member3);
			System.out.println(mf1.member4);
			System.out.println(mf1.member5);
		}
		
		
		MemberField mf2 = new MemberField(1, 1.2, 'A', false, null);
		
		{
			System.out.println(mf2.member1);
			System.out.println(mf2.member2);
			System.out.println(mf2.member3);
			System.out.println(mf2.member4);
			System.out.println(mf2.member5);
			System.out.println(mf1.member6);
			System.out.println(mf1.member7);
			System.out.println(mf1.member8);
			System.out.println(mf1.member9);
			System.out.println(mf1.member10);
		}
		
		
		{
			System.out.println(mf2.member11);
			System.out.println(mf2.member12);
			System.out.println(mf2.member13);
			System.out.println(mf2.member14);
			System.out.println(mf2.member15);
		}
	}

}
