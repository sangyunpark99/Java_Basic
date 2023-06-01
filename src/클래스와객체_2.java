public class 클래스와객체_2 {
    public static void main(String[] args) {
        Car3 myCar3 = new Car3("자동차","ben");
        myCar3.printCarInfo();
        myCar3.printCarInfo(3);
        myCar3.printCarInfo("2023-02-21",3);

        Car3.getName();
    }
}


class Car3 {
    static String name; // 객체끼리 값을 공유한다.
    String type;

    Car3(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name" + name);
        System.out.println("type" + type);
    }

    // 오버로딩 구현
    public void printCarInfo(int number){
        this.printCarInfo();
        System.out.println("number : " + number);
    }

    public void printCarInfo(String data, int number) {
        this.printCarInfo();
        System.out.println("data: " + data);
        System.out.println("number: " + number);
    }

    public static void getName(){
        System.out.println("carName : " + name); // 변수도 스태틱이여야 한다.
    }
}
