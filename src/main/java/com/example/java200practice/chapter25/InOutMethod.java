package com.example.java200practice.chapter25;

import java.util.Scanner;

public class InOutMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 키보드 입력을 받음

        System.out.println("정수를 입력하세요");
        int choice = scanner.nextInt(); // 키보드로 정수 입력
        System.out.println(choice);

        System.out.println("실수를 입력하세요");
        double rchoice = scanner.nextDouble(); // 키보드로 실수 입력
        System.out.println(rchoice);

        System.out.println("문자열을 입력하세요");
        String schoice = scanner.next(); // 키보드로 문자열 입력
        System.out.println(schoice);
    }
    // 키보드 입력은 Scanner의 next() 메소드를 사용하고, 출려은 System.out의 println()메소드를 사용한다.
}
