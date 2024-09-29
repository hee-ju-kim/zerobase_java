import java.lang.reflect.WildcardType;

// 클래스명 : Animal
// 특성 : 이름,무게, 분류
// 기능 : 악기, 잠자기, 걷기, 뛰
class Animal {
	String name;
	Double weight;
	String classification;
	
	Animal (String name, Double weight, String classification) {
		this.name = name;
		this.weight = weight;
		this.classification = classification;
	}
	
	public void printInfo () {
		System.out.println("== Animal Info ==");
		System.out.println("name = " + name);
		System.out.println("weight = " + weight);
		System.out.println("classification = " + classification);
	}
	
	public void eat () {
		System.out.println("냠!");
	}
	public void sleep () {
		System.out.println("쿨쿨");
	}
	public void walk () {
		System.out.println("걷기!");
	}
	public void run () {
		System.out.println("뛰기!");
	}
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal case1 = new Animal("강아지", 5.0, "포유류");
		Animal case2 = new Animal("구피", 0.01, "어류");
		
		case1.printInfo();
		case2.printInfo();
	}

}
