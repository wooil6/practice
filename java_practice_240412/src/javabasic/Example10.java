package javabasic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        // 학생 수 5명의 점수를 입력받기
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 1의 점수 : ");
        int score1 = scanner.nextInt();
        System.out.print("학생 2의 점수 : ");
        int score2 = scanner.nextInt();
        System.out.print("학생 3의 점수 : ");
        int score3 = scanner.nextInt();
        System.out.print("학생 4의 점수 : ");
        int score4 = scanner.nextInt();
        System.out.print("학생 5의 점수 : ");
        int score5 = scanner.nextInt();

        // 점수를 배열에 저장
        int[] score = new int[5];
        score = new int[]{score1, score2, score3, score4, score5};

        // 점수의 총합
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + score[i];
        }

        // 평균 점수를 출력
        System.out.println(sum /5);
    }
}
