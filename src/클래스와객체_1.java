public class 클래스와객체_1 {
    public static void main(String[] args) {

        //Car 클래스
        Car myCar1 = new Car();
        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCarInfo();
        myCar1.move();
        myCar1.brake();

        //Car2클래스
        Car2 myCar2 = new Car2("b","sedan");
        myCar2.printCarInfo();
        myCar2.load();
        myCar2.horn();
    }
}

class Car {
    String name;
    String type;

    public void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void move(){
        System.out.println("이동!");
    }

    public void brake(){
        System.out.println("정지!");
    }
}

class Car2 {
    String name;
    String type;

    Car2(String name, String type){
        System.out.println("constructor");
        this.name = name;
        this.type = type;
    }

    public void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }

    public void load(){
        System.out.println("짐을 주세요");
    }

    public void horn(){
        System.out.println("빵빵!");
    }

}
