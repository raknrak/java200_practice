package com.example.java200practice.chapter44;

public class EvenOdd {
    public static void showOddnEven(int n) {
        int temp = n;
        do {
            if (temp % 2 == 1) { //홀수
                temp = temp * 3 + 1;
            } else {
                temp /=2; // 짝수
            }
            System.out.print("[" + temp +"]");
        } while (temp !=1);
        System.out.println("\n-------------------");
    }

    public static void main(String[] args) {
        showOddnEven(122);
    }
}
// while은 조건이 명확학 때 사용한다.
// while은 조거절이 ㅁ너저 실행되기 때문에 한 번도 실행되지 않을 수 있다.
// do~while은 먼저 실행된 다음 조건절이 실행되기 대문에 적어도 한 번은 실행된다.
// 입력받은 정수가 1 일 때 while은 바로 끝나지만, do~while은 4, 2, 1을 출력한다.

// [61][184][92][46][23][70][35][106][53][160][80][40][20][10][5][16][8][4][2][1]
//-------------------
