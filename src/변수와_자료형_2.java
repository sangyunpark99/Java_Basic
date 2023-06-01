public class 변수와_자료형_2 {
    public static void main(String[] args) {
        //1. 자료형 - 숫자
        System.out.println("== 숫자 ==");
        //1-1. 정수
        int intNum = 10;
        System.out.println("intNum = " + intNum);

        int intNum2 = Integer.MAX_VALUE;
        int intNum3 = Integer.MAX_VALUE+1; // 오버플로우 발생

        System.out.println("intNum2 = " + intNum2);
        System.out.println("intNum3 = " + intNum3);

        long longNum = (long)Integer.MAX_VALUE + 1; // 오버플로우가 발생하지 않는다.
        System.out.println("longNum = " + longNum);

        // 1-2 실수
        float floatNum = 1.23f;
        double doubleNum = 1.23;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 1-3 2진수/ 8진수/ 16진수
        int numBase2 = 0b1100;
        System.out.println("numBase2 = " + numBase2); // 10진수로 변환되어서 출력
        int numBase8 = 014;
        System.out.println("numBase8 = " + numBase8); // 10진수로 변환되어서 출력
        int numBase16 = 0xc;
        System.out.println("numBase16 = " + numBase16); // 10진수로 변환되어서 출력

        System.out.println("0b" + Integer.toBinaryString(numBase2));
        System.out.println("0" + Integer.toOctalString(numBase8));
        System.out.println("0x" + Integer.toHexString(numBase16));


        // 2. 자료형 - 부울
        System.out.println("==부울==");
        boolean isPass = true;
        boolean isOk = false;

        System.out.println("isPass = " + isPass);
        System.out.println("isOk = " + isOk);


        // 3. 자료형 - 문자열
        char keyFirst = 'a';
        char keyLast = 'z';

        System.out.println("keyLast = " + keyLast);
        System.out.println((int) keyFirst); // 아스키 코드 변환
        System.out.println((int) keyLast); // 아스키 코드 변환
    }
}
