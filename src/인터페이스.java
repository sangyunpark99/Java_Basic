public class 인터페이스 {
    public static void main(String[] args) {
        B b = new B("박상윤");
        b.printSchool();
        b.printName();
    }
}

interface A {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}

class B extends C implements A { // C 상속, A 인터페이스 이용

    B(String name){
        this.name = name;
    }

    @Override
    public void printSchool() {
        System.out.println("00 University");
    }
}

class C {
    public String name;
    public void printName(){
        System.out.println("Name: " + name);
    }
}