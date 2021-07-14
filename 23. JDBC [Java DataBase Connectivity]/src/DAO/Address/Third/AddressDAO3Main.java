package DAO.Address.Third;

public class AddressDAO3Main {

	public static void main(String[] args) throws Exception{
		
		AddressDAO3 adrDao3 = new AddressDAO3();
		System.out.println(">> delete: ");
		adrDao3.deleteByNum(5);
		System.out.println();
		
		System.out.println(">> select by number:");
		adrDao3.selectByNum(3);
		System.out.println();
		
		System.out.println(">> insert: "); // 객체를 모아서 여러 데이터를 갖고 있는 한 개의 객체로 만든다?
		Address insertAdd = new Address(0, "aaa", "김슬기", "123-1234", "원주시");
		adrDao3.insert(insertAdd);
		System.out.println();
		
		System.out.println(">> update: ");
		Address updateAdd = new Address(9, "dwe1252", "황원탁", "123-1231", "전주시");
		adrDao3.update(updateAdd);
		
		
		
	}

}
