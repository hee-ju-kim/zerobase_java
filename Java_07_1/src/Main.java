// Car 클래스 - 객체변수, 메소

class Car {
	String name;
	String type;
	
	public void printCarInfo () {
		System.out.println("== Car Info ==");
		System.out.println("name = " + name);
		System.out.println("type = " + type);
	}
	
	public void move() {
		System.out.println("이동");
	}
	
	public void stop() {
		System.out.println("정지!");
	}
}

// Car2 클래스 - 생성자, this
class Car2 {
	String name;
	String type;
	
	Car2 (String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println("생성자 출력!");
	}
	
	public void printCarInfo () {
		System.out.println("== Car Info ==");
		System.out.println("name = " + name);
		System.out.println("type = " + type);
	}
	
	public void load() {
		System.out.println("짐을 주세용");
	}
	
	public void horn() {
		System.out.println("빵");
	}
}



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar1 = new Car();
		mycar1.name = "스포티지";
		mycar1.type = "SUV";
		mycar1.printCarInfo();
		mycar1.move();
		mycar1.stop();
		
		Car2 car2 = new Car2("스포티지", "SUV");
		car2.printCarInfo();
		car2.load();
		car2.horn();
	}

}
