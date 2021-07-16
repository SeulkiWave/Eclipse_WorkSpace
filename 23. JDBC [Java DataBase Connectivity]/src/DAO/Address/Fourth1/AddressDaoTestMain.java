package DAO.Address.Fourth1;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception {
		AddressDao tempAdd = new AddressDao();
		System.out.println("1. insert: "+tempAdd.insert(new Address(0, "000", "AAA", "1234-5678", "SEOUL")));
		System.out.println();
	}

}