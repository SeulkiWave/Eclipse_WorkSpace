package DAO.Address.Fourth;

import java.util.ArrayList;

public class AddressDAOTestMain {

	public static void main(String[] args) throws Exception{
		
		AddressDAO adrDAOtest = new AddressDAO();
		System.out.println(">> delete: ");
		adrDAOtest.deleteByNum(5);
		System.out.println();
		
		System.out.println(">> select by number:");
		adrDAOtest.selectByNum(3);
		System.out.println();
		
		System.out.println(">> selectAll");
		AddressDAO addressDao3 = new AddressDAO();
		ArrayList<Address> addressList = new addressDao3.selectAll();
		for (Address address : addressList) {
			System.out.println(address);
		}
		
		System.out.println(">> insert: ");
		Address insertAdd = new Address(0, "aaa", "김슬기", "123-1234", "원주시");
		adrDAOtest.insert(insertAdd);
		System.out.println();
		
		System.out.println(">> update: ");
		Address updateAdd = new Address(9, "dwe1252", "황원탁", "123-1231", "전주시");
		adrDAOtest.update(updateAdd);
		
		
		
	}

}
