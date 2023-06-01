public class 추상클래스 {
    public static void main(String[] args) {
        // 추상 클래스를 바로 객체로 만들 수 없다.
        StudentAb s1 = new StudentAb();
        s1.printInfo();

        PersonAb p2 = new PersonAb() { // 익명 클래스
            @Override
            void printInfo() {
                System.out.println("PersonAb p2.printInfo()");
            }
        };

        p2.printInfo();
    }
}


// 추상 클래스 Person
abstract class PersonAb {
    abstract void printInfo();
}

// 추상 클래스 상속
class StudentAb extends PersonAb {
    public void printInfo(){
        System.out.println("StudentAb.printInfo");
    }
}