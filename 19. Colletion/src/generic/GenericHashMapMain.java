package generic;
import java.util.HashMap;
import java.util.Iterator;

public class GenericHashMapMain {

	public static void main(String[] args) {
		
		HashMap<String, Car> carMap = new HashMap<String, Car>(); // HashMap은 Key와 Value 둘 다 들어가야 한다!
		// 사용될 때 쓰여지는 타입~
		System.out.println("# Map Size: "+carMap.size());
		
		System.out.println("=============== PUT ===============");
		carMap.put("1111", new Car("1111", 12));
		carMap.put("2222", new Car("2222", 13));
		carMap.put("3333", new Car("3333", 15));
		carMap.put("4444", new Car("4444", 17));
		carMap.put("5555", new Car("5555", 19));
		// Generic으로 선언된 애들이 사용되지 않으면 Type Safety에 문제가 있다는 경고가 발생할 수 있다~
		// should be paramitized ~
		System.out.println("# Map Size: "+carMap.size());
		System.out.println(carMap); // 전체 다 나오네... 참조하고 있는 객체 전부~
		
		carMap.put("3333", new Car("삼삼삼삼", 14)); // key 값이 중복된다~ : 이미 있는 key 값이 참조하는 객체의 데이터 위에 새 데이터를 덮어쓴다
		System.out.println("# Map Size: "+carMap.size()); // 사이즈는 그대로지만
		System.out.println(carMap); // 3333의 주소 바뀐 거 확인하기~
		
		System.out.println("=============== GET ==============="); // 객체가 사라지는 게 아닌 걸 유의하자~ 약간 복붙? 느낌...
		Car getCar = carMap.get("3333"); // 해당 Key는~ get에서 value 값을 요하기 때문에 casting이 필요하지 않다
		getCar.print();
			
		/*
		getCar = carMap.get("9999"); // 없으면 안 뽑히는 대신 null을 반환시킨다~
		getCar.print();
		*/
		/*
		if (getCar != null) { // 이런 작업이 없는 경우 nullPointerException이 발생할 수 있다~
			getCar.print();
		}
		*/
		
		System.out.println("=============== REMOVE ===============");
		// Remove the mapping for the specified key from this map if present;
		Car rmvCar = carMap.remove("3333"); // remove를 할 경우 value를 반환시킨다...
		rmvCar.print();
		
		System.out.println("# Map Size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("=============== < 전 체  차 량  출 력 > ==============="); // set 다시 보기!!!!!!!!!!!!!!!
		// 어떤 것을 중점으로 돌릴지에 따라 key / value를 <E>에 다르게 지정시킬 수 있다
		Iterator<String> carKeyIter = carMap.keySet().iterator(); // 이렇게 해야 하는...... // set은 String... 
		// .keySet() 으로 끝냈으면 set이 반환된다고.........?
		
		while (carKeyIter.hasNext()) {
			String key = carKeyIter.next(); // 이거 제대로 이해하기 ㅠㅠ
			Car tempCar = carMap.get(key);
			tempCar.print();
		}
		
		System.out.println("=============== < 입 차 > ===============");
		Car carNew = new Car("2389", 3);
		carMap.put(carNew.getNo(), carNew); // Map 배열에 키 값(차량 번호 get method)과 carNew라는 Car 타입 객체를 대입~
		
		System.out.println("# Map Size: "+carMap.size());
		System.out.println(carMap);
		// toString 다시 확인하기... 이게 도대체 무슨 원리로 이렇게 되는겨
		
		System.out.println("========== < 차 량 번 호 와  동 일 한  차 량  객 체  출 력 > ==========");
		Car carOut = carMap.get("2389");
		carOut.print();
		
		System.out.println("===== < 지 정  입 차  시 간  이 후 의  차 량  여 러 대  찾 아 서  출 력 > =====");
		Iterator <String> carOutKeyIter = carMap.keySet().iterator();
		while(carOutKeyIter.hasNext()) {
			String key = carOutKeyIter.next();
			// carMap.get(key); // 바로 해당 key 값을 가진 car를 반환시킨다?
			Car tempCar = carMap.get(key);
			if (tempCar.getInTime() >= 15) {
				tempCar.print();
			}
		}
		
		System.out.println("========== < 차 량 번 호 와  동 일 한  차 량  출 차 > ==========");
		Car outCar = carMap.get("2389");
		outCar.setOutTime(12);
		outCar.calculateFee();
		outCar.print();
		carMap.remove("2389"); // key 값이 같은 객체가 지워진다~
		System.out.println("# Map Size: "+carMap);
		System.out.println(carMap);
		
		System.out.println("=============== < I T E R A T I O N > ===============");
		Iterator <String> carIter3 = carMap.keySet().iterator();
		while (carIter3.hasNext()) {
			String key = carIter3.next();
			carMap.get(key).print();
		}
		
	} // MAIN END

}
