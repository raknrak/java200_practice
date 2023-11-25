package com.example.java200practice.chapter27;

public class BioCaldendar {
    public static final int PHYSICAL =23; // 상수 정의 , 상수값은 변경 불가

    public static void main(String[] args) {
        int index = PHYSICAL; // 상수값을 변수에 대입
        int days = 1200;
        double vals = (days % index)* 2 * Math.PI/index;
        System.out.println(Math.toDegrees(vals)+ "도");
        // 연산시 int값과 double값이 같이 있으면 결과값은 자동으로 double이 됨
        // 정수/정수는 몫은, 정수%정수는 나머지를 구한다
        // 62.608695652173914도
    }
}
