public class 상속 { // Java는 다중 상속 불가능
    public static void main(String[] args) {
        Student2 student2 = new Student2("박상윤",24,2018136036);
        student2.printInfo();
    }
}

class Person {
    String name;
    int age;
    public int a1;
    private int a2; // 상속받으면 사용할 수 없다.

    Person(){

    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Person.printInfo");
        System.out.println("name" + name);
        System.out.println("age:" + age);
    }

}

// Student 클래스 - Person 상속, 접근 제어자 확인
class Student extends Person {

    Student(){
        a1 = 1;
        // a2 = 1;
    }
}

class Student2 extends Person {
    String name;
    int stdId;

    Student2(String name, int age, int stdId) {

        super(name,age); // 부모 클래스 생성자 호출

        this.name = name; // this
        this.age = age; // 상속 받은 age를 의미함
        this.stdId = stdId; // this
        //super.name = name; // 부모 객체의 변수
    }

    @Override
    public void printInfo(){
        System.out.println("Student2.printInfo");
        System.out.println("name" + name);
        System.out.println("age:" + age);
        System.out.println("stdId = " + stdId); // 추가 로직
    }
}