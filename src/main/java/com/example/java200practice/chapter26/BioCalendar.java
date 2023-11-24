package com.example.java200practice.chapter26;

public class BioCalendar {
    public static final int PHYSICAL=23; // 상수( 사용자 정의

    public static void main(String[] args) {
        System.out.println(PHYSICAL);
        int index = PHYSICAL; // 상수값을 변수에 대입(index)에 23이 저장
        //Math.PI 3.14에서 정의되어 있는 함수
        double vals = 2 * Math.PI/index;
        System.out.println(vals + "라디안");
    }
    //23
    //0.2731819698773733라디안
}
