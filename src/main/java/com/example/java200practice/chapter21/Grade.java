package com.example.java200practice.chapter21;

import org.w3c.dom.ls.LSOutput;

public class Grade {
    public static void main(String[] args) {
        int[] grade = {90, 80, 89}; // 정수 타입 배열 저장
        int tot = grade[0] + grade[1] + grade[2];
        int average = tot/3; // 정수 연산은 정수
        System.out.printf("국어 %d점, 영어 %d점, 수학 %d점 => \t",
                grade[0], grade[1], grade[2]);
        System.out.printf("총점 %d점, 평균 %d점\n", tot, average);
        // 국어 90점, 영어 80점, 수학 89점 => 	총점 259점, 평균 86점
        //%d는 정수값의 대입 위치 표시
    }
}
