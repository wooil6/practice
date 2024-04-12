package javabasic;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        // 콘솔로 실수 입력받아서
        // 조건문으로 0으로 나누기 제외

        Scanner scnner = new Scanner(System.in);

        // 숫자와 연산자 String타입으로 받고 수를 double타입으로 변환
        System.out.print("숫자 입력 : ");
        String num1 = scnner.nextLine();

        System.out.print("연산자 입력 : ");
        String op = scnner.nextLine();

        System.out.print("숫자 입력 : ");
        String num2 = scnner.nextLine();

        // /를 받았을 때 0이 올 수 없는 조건
        if(op.equals("/") && num2.equals("0")) {
            System.out.println("0으로 나누기 불가");
        }


        double firstnum = Double.parseDouble(num1);
        double secondnum = Double.parseDouble(num2);

        if(op.equals("+")) {
            System.out.println(firstnum + secondnum);
        } else if(op.equals("-")) {
            System.out.println(firstnum - secondnum);
        } else if (op.equals("*")) {
            System.out.println(firstnum * secondnum);
        } else
            System.out.println(firstnum / secondnum);


    }
}
