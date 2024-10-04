import car.Car2;

class Car {
	String name;
	String type;
	
	Car (String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println("생성자 출력!");
	}
	
	public void printCarInfo () {
		System.out.println("== Car Info ==");
		System.out.println("name = " + name);
		System.out.println("type = " + type);
	}
	
	// 오버로딩 구현
	public void printCarInfo (String date) {
		this.printCarInfo();
		System.out.println("date = " + date);
	}
	
	public void printCarInfo(int number) {
		this.printCarInfo();
		System.out.println("num = " + number);
	} 
	
	public void printCarInfo (String date, int num) {
		this.printCarInfo();
		System.out.println("date = " + date);
		System.out.println("num = " + num);
	}
}

class Car3 {
	static String name = "None";
	String type;
	
	Car3 (String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println("생성자 출력!");
	}
	
	public void printCarInfo () {
		System.out.println("== Car Info ==");
		System.out.println("name = " + name);
		System.out.println("type = " + type);
	}
	
	// 스태틱메서드
	// 스태틱메서드 안에서 쓰이는 변수도 스태틱이어야함
	static public void getName () {
		System.out.println("Car name = " + name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("스포티지", "SUV");
		car.printCarInfo();
		
		// 1. 오버로딩
		System.out.println("== 오버로딩 ==");
		car.printCarInfo("2022");
		car.printCarInfo(1234);
		car.printCarInfo("2022", 1234);
		
		// 2. 접근제어자
		System.out.println("== 접근제어자 ==");
		Car2 car2 = new Car2("A", "B", "C", "D");
		System.out.println(car2.name1);
//		System.out.println(car2.name2);
//		System.out.println(car2.name3);
//		System.out.println(car2.name4);
		
		// 3. Static
		System.out.println("== Static ==");
		Car3.getName();
		
		Car3 car3 = new Car3("a", "sedan");
		Car3 car4 = new Car3("b", "suv");
		Car3 car5 = new Car3("c", "rv");
		
		car3.printCarInfo();
		car4.printCarInfo();
		car5.printCarInfo();
		
		// name은 스태틱ㄱ변수라서 클래스끼리 공유해서 c만 출력
	}

}
