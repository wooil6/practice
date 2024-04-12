package javabasic;

import java.util.Scanner;

public class Example06 {
    public static void main(String[] args) {
        // int 타입을 입력받아서 양수, 음수, 0 판단

        // 수를 스캐너로 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("수를 입력 : ");
        int num = scanner.nextInt();

        // 0, 음수, 양수인지 판단하기
        if (num == 0) {
            System.out.println("0 입니다");
        } else if (num > 0) {
            System.out.println("양수입니다");
        } else {
            System.out.println("음수입니다");
        }

    }
}
