package com.example.java200practice.chapter20;

public class Grade01 {
    public static void main(String[] args) {
        int kor = 90;
        int eng = 80;
        int math = 89;
        int tot = kor + eng + math; // 259
        int average = tot/3; // 정수 연산은 정수 86.3333 -> 86
        System.out.printf("국어 %d점, 영어 %d점, 수학%d점 =? \t", kor,eng,math);
        System.out.printf("총점 %d점, 평균 %d\n", tot, average);
        //국어 90점, 영어 80점, 수학89점 =? 	총점 259점, 평균 86
    }
}
