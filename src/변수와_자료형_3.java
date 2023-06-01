public class 변수와_자료형_3 {
    public static void main(String[] args) {
        // 1.자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello world!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

        // 1-1. equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3 == s4); // 주솟값 비교 ?

        //Java에서, String 객체는 불변(immutable)합니다.
        // 즉, 한 번 생성된 String 객체는 변경할 수 없습니다. 이러한 불변성은 String 객체가 문자열 풀에서 재사용될 수 있게 합니다.
        //Java는 리터럴로 생성된 문자열을 문자열 풀에 저장합니다.
        // "Hi"라는 문자열 리터럴을 두 번 사용했을 때,
        // Java는 첫 번째 "Hi"를 문자열 풀에 생성하고 두 번째 "Hi"에서는 이미 문자열 풀에 있는 같은 값을 참조합니다.
        // 그래서 s3와 s4는 같은 메모리 위치를 참조하게 됩니다.

        System.out.println(s3.equals(s4));
        String s5 = new String("Hi"); // 새로운 객체 생성
        System.out.println(s3.equals(s5)); // 값 비교
        System.out.println(s3 == s5);

        // 1-2 indexOf - 원하는 값의 index 찾기
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!")+1));

        // 1-3 replace - 값 대체하기
        String s7 = s6.replace("Hello","Bye");
        System.out.println("s7 = " + s7);

        // 1-4 substring - 부분 문자열 찾기
        System.out.println(s7.substring(0,3)); // 한개 전까지
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

        // 1-5 toUpperCase - 대분자로 변경
        System.out.println(s7.toUpperCase());

        // 2. 자료형 - StringBuffer - 가변하는 문자열을 처리하기 위한 클래스 | 기존 객체 계속 사용
        System.out.println(" == StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789"); // 기존 객체를 계속 사용해준다.
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);

        a += b; // 새롭게 객체를 생성해서 다시 만들어준다.
        System.out.println(a);
        System.out.println(a == bak);

        // 3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1,2,3,4,5}; // int형 배열
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'}; // char 형 배열
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3]; // 3개로 지정 - String 형 배열
        myArray3[0] = "hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
    }
}
