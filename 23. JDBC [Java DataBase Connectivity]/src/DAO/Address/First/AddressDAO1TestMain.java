package DAO.Address.First;

public class AddressDAO1TestMain {

	public static void main(String[] args) throws Exception {
		
		AddressDAO1 adrDAO1 = new AddressDAO1();
		System.out.println("1. Insert");
		adrDAO1.insert();
		
		System.out.println("2. Update");
		adrDAO1.updateByNum();
		
		System.out.println("3. Delete");
		adrDAO1.deleteByNum();
		
		System.out.println("4. Select By Num");
		adrDAO1.selectByNum();
		
		System.out.println("5. Select All");
		adrDAO1.selectAll();
		
		
	}

}
