//package javabasic;
//
//import java.util.Scanner;
//
//public class Example03 {
//    public static void main(String[] args) {
//        // 이름과 나이를 입력 받고
//        // 화면에 출력
//        // 나이를 입력받을때 숫자가 아닌 문자가 들어오면 "잘못입력했습니다"
//
//        // 콘솔 입력을 Scanner 객체 생성
//        Scanner scanner = new Scanner(System.in);
//
//
//        // 이름에 문자만
//        System.out.print("이름 입력 : ");
//        String name = scanner.nextLine();
////        if (scanner.nextLine() != ) {
////            System.out.println("잘못입력했습니다");
////        }
//        // 문자열 중 숫자가 있으면 오류 메세지 출력
//        String digit = "0123456789";
//        for (int i = 0; i < name.length(); i++) {
////            name.charAt(i) // 숫자면 틀림
//            // digit에 있는 숫자가 걸린다면
//            if(digit.indexOf(name.charAt(i)) != -1) {
//                System.out.println("이름에 글자만 입력하세요");
//                return; // 메인이 끝남 뒤에 값을 넣으면 값을 변환.아무것도 안쓰면 안넣고 끝남
//            }
//        }
//
//
//
//
//        System.out.print("나이 입력 : ");
//        String age = scanner.nextLine();
//
//        for(int i = 0; i < age.length(); i++) {
//            if (digit.indexOf(age.charAt(i)) == -1) {
//                System.out.println("나이에 숫자만 입력하세요");
//                return;
//            }
//        }
//
////         //나이에서 입력받은 문자를 하나씩 보면서 숫자인지, 문자인지 확인"
////        for (int i = 0; i <= age.length(); i++) {
////            if (Character.isDigit(age.charAt(i))) {
////                System.out.println();
////            }
////        }
////
////        // 결과가 faluse면 "잘못입력했습니다" 출력
////            boolean result;
////             if (result == false) {
////            System.out.println("잘못입력했습니다");
//        // if 문에는 false가 들어오면 실행X
////        }
//
//        System.out.println("이름은 " + name + " 나이는 " + age);
//
//    }
////    public static boolean isDigit(String str) {
////
////    }
////}
