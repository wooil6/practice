package javabasic;

public class Example11 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 50, 20, 60, 801, 11};
        findMaxMinNumber(arr);
    }
    public static void findMaxMinNumber (int[] arr) {
        // 최댓값, 최솟값을 찾아 출력
        // arr를 순회하여 최댓값을 찾기
        // arr를 순회하여 최솟값을 찾기


        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        System.out.println("최댓값 : " + max + " / 최솟값 :" + min);


    }
}
