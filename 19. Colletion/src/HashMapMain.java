import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		
		HashMap carMap = new HashMap();
		System.out.println("map size: "+carMap.size());
		
		System.out.println("1. put ------------------------------");
		Car c1 = new Car("1111", 12);
		carMap.put("1111", c1); // key = String , Data = Car 객체~ --> 둘 다 최종적으로는 Object. 숫자나 다른 값을 넣더라고 Auto Boxing~
		// key 는 대부분 String이나 Boxing된 객체를 넣음..
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 19));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		/*
		 * 동일한(equals) 키값은 존재하지 않음~
		 * 동일한 키 값이 대입됐을 때는 뒤의 데이터가 변경된다...
		 */
		carMap.put("3333", new Car("1234", 07));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("2. get ------------------------------");
		Car getCar = (Car) carMap.get("3333");
		getCar.print();
		
		System.out.println("3. remove ------------------------------");
		Car delCar = (Car) carMap.remove("3333");
		delCar.print();
		System.out.println("map size: "+carMap.size());
		
		System.out.println(" * 전체 차량 출력 ------------------------------");
		Set keySet = carMap.keySet(); // 이게 Iterator가 가능하다고 하네요... map --> set
		System.out.println(keySet);
		Iterator keyIter = keySet.iterator();
		while (keyIter.hasNext()) {
			String key = (String) keyIter.next();
			System.out.println(key); // key로 value 꺼내기..
			Car carTemp = (Car) carMap.get(key);
			carTemp.print();
		}
		
		
		System.out.println(" * 입차 ------------------------------");
		carMap.put("3243", new Car("3243", 6));
		System.out.println("map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println(" * 차량번호(3243) 찾아서 해당 차량 정보 1개 출력 ------------------------------");
		getCar = (Car) carMap.get("3243");
		getCar.print();
		
		System.out.println(" * 입차 시간 10시 이후인 차량 여러대의 정보 출력 ------------------------------");
		
		
		System.out.println(" * 출차 ------------------------------");
		getCar = (Car) carMap.get("3243");
		getCar.setOutTime(12);
		getCar.calculateFee();
		getCar.print();
		carMap.remove("3243"); // HashMap에서 해당 객체를 삭제하는 과정~
		System.out.println("map size: "+carMap.size()); // 사이즈가 줄어든다~ 3243 차량이 사라진다~		
		
		
		
	}

}
