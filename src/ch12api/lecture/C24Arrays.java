package ch12api.lecture;

import java.util.Arrays;

public class C24Arrays {
    public static void main(String[] args) {
        // Arrays : 배열을 다루는 메소드들 있음
        // equals : 두 배열이 같은지
        // fill : 배열을 특정 값으로 채우기
        // sort : 배열 정열
        // binarySearch : 특정 원소의 위치 찾기
        // toString : 문자열로 변환

        // fill
        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 10;
        }
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

        // sort
        int[] arr2 = {3, -2, 10, 0, -1};
        System.out.println("정렬 전");
        System.out.println(Arrays.toString(arr2));
        System.out.println("정렬 후");
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // equals
        int[] arr3 = {3, 4, 5};
        int[] arr4 = {3, 4, 5};
        int[] arr5 = {3, 4, 5};

        System.out.println(arr3 == arr4);    // false
        System.out.println(Arrays.equals(arr3, arr4));  // true
        System.out.println(Arrays.equals(arr4, arr5));  // true

        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4, arr5)); // true

        System.out.println();

        // binary search: 이진 탐색
        int[] arr6 = {5, 3, 1, 7, 9};
        int i = Arrays.binarySearch(arr6, 3);
        System.out.println(i);      // sort 안해서 음수 나옴
        Arrays.sort(arr6);
        int j = Arrays.binarySearch(arr6, 3);
        System.out.println(j);      // sort 후라 index 1이 나옴
        int k = Arrays.binarySearch(arr6, 4);
        System.out.println(k);      // 없는 수라 음수 나옴

    }
}
