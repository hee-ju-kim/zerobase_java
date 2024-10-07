import javax.print.attribute.standard.MediaSize;

// Java 프로그래밍 - 내부 클래스
class Outer {
    public void print () {
        System.out.println("out print");
    }

    class Inner {
        public void innerPrint() {
            Outer.this.print();
        }
    }

    static class InnerStatic {
        void innerPrint () {
//            Outer.this.print(); outer가 static이아니라서 안됨
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    @Override
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Main {

    public static void main(String[] args) {

//      외부 클래스
        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner();

//      내부 클래스 - 정적
        Outer.InnerStatic is1 = new Outer.InnerStatic();

//      익명 클래스
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };


    }

}
