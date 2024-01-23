package com.example.java200practice.chapter46;
//while을 이용하여 서로 다른 세 정수 만들기
public class BioRandom {
    public static void main(String[] args) {
        int range = 10;
        int start = 1;
        int a =0, b=-0, c=0;

        while (true) {
            a = (int) (range * Math.random() + start);
            b = (int) (range * Math.random() + start);
            c = (int) (range * Math.random() + start);
            if(a != b && b != c && c != a) break;
        }
        System.out.printf("%d\t%d\t%d" ,a, b, c);

    }
    //(int)(10 * Math.randomO +1)은 1과 10 사이 임의의 정수를 반환
    //세 수가 서로 다르기 위해 && 논리 연산자를 사용
    //세 수가 모두 다르면 while End
}
