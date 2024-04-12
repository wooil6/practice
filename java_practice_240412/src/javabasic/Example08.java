package javabasic;

import java.util.Scanner;

public class Example08 {
    public static void main(String[] args) {
        // 숫자 n을 입력받아 1부터 n까지의 합을 계산하여 출력하는 프로그램
        // int로 입력을 받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("수를 입력 :");
        int num = scanner.nextInt();

        if(num < 0) {
            System.out.println("정수를 입력하세요");
        }


        // 1부터 출력받은 숫자까지의 합
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
