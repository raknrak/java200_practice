package com.example.java200practice.chapter43;

//while
public class EvenOdd {
    public static void showOddnEvenw(int n) {
        int temp = n;
        while(temp!=1){ //temp가 1이 될 때까지 반복
            if (temp % 2 == 1) { // 홀수
                temp = temp*3+1; // 홀수면 3배한 값에 1을 더함
            }else{
                temp/=2; // 짝수면 2로 나눔
            }
            System.out.print("["+temp+"]");
        }
        System.out.println("\n---------------------");
    } //[61][184][92][46][23][70][35][106][53][160][80][40][20][10][5][16][8][4][2][1]


    public static void main(String[] args) {
        showOddnEvenw(122);
    }
}
