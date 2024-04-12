package javabasic;

public class Example09 {
    public static void main(String[] args) {
        // 10개의 정수 값을 저장할 수 있는 배열을 생성
        int[] num = new int[10];

        // 1~10까지 값을 배열에 저장
        num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 저장한 값을 출력
        for(int i = 0; i < 10; i++) {
            System.out.println(num[i]);
        }
    }
}
