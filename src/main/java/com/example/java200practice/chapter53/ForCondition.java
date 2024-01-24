package com.example.java200practice.chapter53;
// for와 if를 이용하여 홀수의 합 구하기
public class ForCondition {

    public static void main(String[] args) {
        int s = 0;
        for (int i =1; i <= 100; i++){
            // s = s+i;
            s += i;

        }
        System.out.println("1~100 의 합 : " + s);
        s = 0; // 0으로 초기화
        for (int i =1; i <= 100; i++){
                    if (i % 2 == 1) {
                // s = s+i;
                s += i;

            }
        }
        System.out.println("1~100 사이의 홀수의 합 " + s);
        //1~100 의 합 : 5050
        //1~100 사이의 홀수의 합 2500
    }
}
