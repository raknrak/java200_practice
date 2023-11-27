package com.example.java200practice.chapter34;

public class EvenOddCondition {
    public static void main(String[] args) {
        int temp = 99;
        if(temp%2==1){// 홀수
            temp=temp*3+1;
        } else{
            temp=temp/2; // 짝수
        }
        System.out.printf("계산 후 = %d\n",temp);
    }
    //계산 후 = 298
    // if절은 (연산)결과의 true/false에 따라 다른 구문({ })이 실행된다.
}
