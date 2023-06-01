public class 다형성 {
    public static void main(String[] args) {
        // 1. 다형성
        System.out.println("== 다형성 ==");
        Person p2 = new Person();
        Student3 s1 = new Student3();
        Person p3 = new Student3(); // 다형성

        s1.print();
        s1.print2();// print2()는 되지 않는다.

        Person p4 = new CollegeStudent();

        // 2.타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅 - 자식 클래스의 객체 -> 부모 클래스의 타입

        pp1 = pp2;
        pp1 = ss2;
        ss1 = (Student)pp3; // 형변환이 가능하다. - 다운 캐스팅


        // 3. instanceof
        Person pp5 = new Person();
        Student st2 = new Student();
        Person pp6 = new Student();
        Person pp4 = new CollegeStudent();

        System.out.println(pp5 instanceof Person);
        System.out.println(st2 instanceof Student);
        System.out.println(st2 instanceof Person);
        System.out.println(pp6 instanceof Person);
        System.out.println(pp4 instanceof Person);

        if(pp6 instanceof Student){
            Student stu1 = (Student) pp6;
        }
    }
}

class Student3 extends Person {
    public void print(){
        System.out.println("Student.print");
    }

    public void print2(){
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print(){
        System.out.println("CollegeStudent.print");
    }
}
