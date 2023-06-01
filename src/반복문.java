public class 반복문 {
    public static void main(String[] args) {
        // 1. 반복문 - for
        System.out.println("== for ==");
        // 1-1. 기본 사용 방법
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 5; i++){
            if(i == 2){
                break;
            }

            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1-2. for each
        System.out.println("== for each ==");
        int[] nums = {1,2,3,4,5};

        for (int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }

        for (int num : nums) { // for each
            System.out.println(num);
        }

        // 2. 반복문 - while
        System.out.println("== while ==");

        int i = 0;
        while(i < 5) {
            System.out.println(i++);
        }

        System.out.println();
        i = 0;
        while(i < 5) {
            if(i == 2) {
                i++;
                break;
            }
            System.out.println(i++);
        }

        // 2-2. do-while
        System.out.println("== do-while ==");
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);

        // 01.
        System.out.println(" == 01 ==");
        for (int k = 0; k < 4; k++) {
            for(int j = 0 ; j < 2*k+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" == 02 ==");

        int waterTemperature = 0;

        while(waterTemperature < 100){
            waterTemperature ++;
            if(waterTemperature%10 == 0){
                System.out.printf("현재 %d도 입니다.",waterTemperature);
                System.out.println();
            }
        }
    }
}
