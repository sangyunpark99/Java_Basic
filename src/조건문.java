public class 조건문 {
    public static void main(String[] args) {
        // 1. 조건문 - if
        System.out.println("== if ==");
        int waterTemperature = 99;

        if(waterTemperature >= 100){
            System.out.println("물이 끓습니다.");
        } else {
            System.out.println("물을 끓이는 중입니다.");
        }

        int score = 90;
        char grade = 0;

        if(score >= 90){
            grade = 'A';
        }else if (score >= 80) {
            grade = 'B';
        }else if (score >= 70) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);

        // 2. 조건문 - switch
        System.out.println("== switch ==");
        String fruit = "apple";

        switch(fruit){
            case "apple":
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry":
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }

        // 01. number의 값이 홀수인지 짝수인지 판단하는 코드를 작성하시오.
        int number = 5;
        if(number % 2 == 0){
            System.out.println("짝수 입니다.");
        }else{
            System.out.println("홀수 입니다.");
        }

        //02. switch 조건문 기반으로 바꾸어보아라
        score = 85;

        switch(score/10){
            case 10:

            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("grade = " + grade);
    }
}
