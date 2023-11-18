package com.example.java200practice.chpater15;

public class JavaPrimarytype {
    public static void main(String[] args) {
        // 참 거짓을 나타내는 타입인 boolean을 선언하고,
        // false(거짓)를 변수(isL)에 임시 저장한다.
        boolean isL = false;
        char suit = 'H';    //'H'를 문자 타입 변수 suit에 저장한다.
        int year = 2016;    // 소수점 없는 정수를 year에 저장한다.
        // 소수점(.)이 있는 실수를
        double latitude = 37.52127220511242; // latitude와 
        double longitude = 127.0074462890625; // longitude에 각각 저장한다.
        // "\t"는 이스케이프 문자로 탭(7자 띄우기)을 의미한다.
        System.out.println(latitude + "\t" + longitude);

    }
}
