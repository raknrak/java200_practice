package com.example.java200practice.chapter37;

public class BioSwitch {
    public static final int PHYSICAL = 23;
    public static final int EMOTIONAL = 28;
    public static final int INTELLECTUAL = 33;

    // 메소드 선언
    public static String textInfor(int index, double value){
        String result = "";
        switch(index){
            case PHYSICAL: result = "신체 지수 : "; break;
            case EMOTIONAL: result = "감정 지수 : "; break;
            case INTELLECTUAL: result = "지성 지수 :"; break;
            default: result = "미결정 : "; break;
        }
        return result + (value*100);
    }

    public static void main(String[] args) {
        int index = PHYSICAL;
        double value = 0.86;
        String st = textInfor(index, value); // 메소드 호출하여 문자열 반환
        System.out.println(st);
    }
    // 신체 지수 : 86.0
}
