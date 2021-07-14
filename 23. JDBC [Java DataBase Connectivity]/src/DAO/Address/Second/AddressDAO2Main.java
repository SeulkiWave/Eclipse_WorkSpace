package DAO.Address.Second;

public class AddressDAO2Main {

	public static void main(String[] args) throws Exception{
		
		AddressDAO2 adrDao2 = new AddressDAO2();
		System.out.println(">> delete: ");
		adrDao2.deleteByNum(5);
		System.out.println();
		
		System.out.println(">> select by number:");
		adrDao2.selectByNum(3);
		System.out.println();
		
		System.out.println(">> insert: ");
		adrDao2.insert("ㅋㅋㅋ", "김슬기", "123-4567", "경상남도 통영시");
		// sequence는 알아서 sql 이 만들어주니까 굳이 내가... 인자를 대입할 필요가 없다
		adrDao2.insert("zxc", "김슬기2", "111-1111", "경상남도 통영시");
		System.out.println();
		
		System.out.println(">> update: ");
		adrDao2.updateByNum(1, "one", "김슬기", "111-1111", "울산시");
		
		
	}

}
