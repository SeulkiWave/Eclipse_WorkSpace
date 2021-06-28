package com.itwill06.collection.car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CarServiceHashMap {
	
	private HashMap<String,Car> carMap; // Map은 key값과 Value를 함께 갖는다. . ..
	private int count;// 주차장 구획수

	public CarServiceHashMap() { // 기본 생성자
		carMap = new HashMap<String,Car>();
		count = 30;
	}

	public CarServiceHashMap(int count) { // 구획 수를 정해주는 생성자~
		carMap = new HashMap<String,Car>();
		this.count = count;
	}

	// 0. 차 객체 인자로 받아서 입차 후 성공 - 실패 여부 반환 
	// - 주차장이 만차이면: count>= carMap.size() 입차 실패!
	public boolean ipCha(Car inCar) {
		Set<String> keyCar = carMap.keySet();
		Iterator<String> keyIter = keyCar.iterator();
		String tempKey = inCar.getNo();
		boolean isAdd = true;
		
		while (keyIter.hasNext()) {
			if (carMap.size() < count && !(tempKey.equals(keyIter))) {
				carMap.put(tempKey, inCar);
				isAdd = true;
				break;
			}
		}
		return isAdd;
	}
		

	// 1. 전체차량출력
	public void print() {
		Car.headerPrint();
		Iterator<String> keyIter = carMap.keySet().iterator();
		while (keyIter.hasNext()) {
			String keyCar = (String) keyIter.next();
			System.out.println(keyCar);
		}
	}

	// 5. 차량 번호(4567번) 인자 받아서 차 객체 한 대 참조 변수 반환
	public Car findByNo(String no) {
		Car findCar =null;
		Iterator<String> keyIter = carMap.keySet().iterator();
		while (keyIter.hasNext()) {
			String key = (String) keyIter.next();
			if (carMap.get(key).getNo().equals(no)) {
				findCar = carMap.get(key);
				break;
			}
		}
		return findCar;
	}

	// 6. 입차 시간 (8시 이후) 인자 받아서 ArrayList (차 객체 배열) 참조 변수 반환
	public ArrayList<Car> findByInTime(int inTime) {
		ArrayList<Car> findCars = new ArrayList<Car>();
		Iterator<String> keyIter = carMap.keySet().iterator();
		while (keyIter.hasNext()) {
			String key= (String) keyIter.next();
			if (carMap.get(key).getInTime() >= inTime) {
				findCars.add(carMap.get(key));
			}
		}
		return findCars;
	}

	// 7. 차량 번호 (7891번), 출차 시간(12시) 인자로 받아서 출차;
	public Car chulCha(String no, int outTime) {
		Car removeCar= null;
		Iterator<String> keyIter = carMap.keySet().iterator();
		while (keyIter.hasNext()) {
			String key = (String) keyIter.next();
			if (carMap.get(key).getNo().equals(no)) {
				carMap.get(key).setOutTime(outTime);
				carMap.get(key).calculateFee();
				removeCar = carMap.get(key);
				carMap.remove(key);
			}
		}
		return removeCar;
	}
	
	// 2. 주차 전체 구획 수 반환
	public int getParkingLotCount() {
		return this.count;
	}
	
	// 3. 주차 가능 주차 구획 수 반환
	public int getAvailableParkingLotCount() {
		return count-carMap.size();
	} 
	
}