package com.example.java200practice.chapter45;

public class EvenOdd {
    public static void showOddnEven(int n) {
        int temp = n;
        for (; temp != 1; ) {
            if (temp % 2 == 1) { //홀수
                temp = temp * 3 + 1;
            } else {
                temp /=2; // 짝수
            }
            System.out.print("[" + temp +"]");
        }
        System.out.println("\n---------------");
    }

    public static void main(String[] args) {
        showOddnEven(122);
    }
}
// for는 for(초기값 ; 조건 ; 스텝){바디}로 구성된다
// 이때 초기값, 조건, 스텝을 모두 제거하고 for(; ;){}로 사용할 수 있다.
// 조건을 명시하지 않으면 for(; true ;) {}가 되어 while(true)가 된다.
// 초기값, 스텝이 없다면 while(조건)과 동일하다. -> while(temp !=1){}과 값이 같다.

//[61][184][92][46][23][70][35][106][53][160][80][40][20][10][5][16][8][4][2][1]
//---------------
