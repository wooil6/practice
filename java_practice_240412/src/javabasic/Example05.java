package javabasic;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {


        // 세 개의 정수 값을 비교하여 가장 큰 수와 가장 작은 수를 결정
        // 세 개의 수를 입력 받기

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력 : ");
        int num1 = scanner.nextInt();

        System.out.print("숫자를 입력 : ");
        int num2 = scanner.nextInt();

        System.out.print("숫자를 입력 : ");
        int num3 = scanner.nextInt();



        // 세 개의 수를 순회하며 가장 큰 수, 작은 수 찾기
        Integer[] arr = {num1, num2, num3};
     // int[] numberArr = new int[]{num1, num2, num3};

        int min = arr[0];
        int max = arr[0];


        for(int i = 0; i < arr.length; i++) {
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//
//            if (max < arr[i]) {
//                max = arr[i];
//            }
            max = Math.max(max, arr[i]); // 위의 코드를 쉽게 나타냄
            min = Math.min(min, arr[i]); // 위의 코드를 쉽게 나타냄
        }

        // 출력 가장 큰수 , 가장 각은 수
        System.out.println("가장 큰 수는 " + max + "가장 작은 수는 " + min );
    }
}
