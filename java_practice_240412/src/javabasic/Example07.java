package javabasic;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        // 1~100까지 정수 중에서 짝수만 출력하는 프로그램
        // int 타입으로 작성
        // 짝수는 %2 == 0
        for (int i = 1; i <= 100; i++) {
            if(i %2 == 0) {
                System.out.println(i);
            }
        }
    }
}
