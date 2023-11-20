package com.example.java200practice.chapter23;

public class Letters {
    public static void main(String[] args) {
        char a = '닳';
        String letter = "동해 물과 백두산이 마르고 닳도록 " +
                "하느님이 보우하사 우리나라 만세";
        int letterNumber = letter.length();
        int loc = letter.indexOf(a);
        System.out.printf("\" %s \" => %d자이며, '%c은' %d번째 있다.\n",
                letter, letterNumber, a, loc);
        char b = letter.charAt(loc);
        System.out.printf("\"%s\"의 %d번째 문자는 '%c'이다.", letter,loc,b);
        //%s는 문자열, %d는 정수, %c는 문자.
            }
                 //" 동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세 " => 36자이며, '닳은' 15번째 있다.
                 //"동해 물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세"의 15번째 문자는 '닳'이다.
}
