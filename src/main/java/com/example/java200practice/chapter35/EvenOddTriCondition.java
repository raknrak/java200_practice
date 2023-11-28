package com.example.java200practice.chapter35;

public class EvenOddTriCondition {
    public static void main(String[] args) {
        int temp = 99;
        temp = (temp%2==1)? temp*3+1 : temp/2; // 참일 때 반환되는 값 : 거짓일 때 반환되는 값
        System.out.printf("계산 후 = %d\n",temp);
    }
    //계산 후 = 298
}
//if를 간단하게 삼항연산자로 변경할 수 있다.
// if(A) { D = B
//} else { D = C}는
// D =  A? B:C 와 같다
// B, C, D 타입이 동일해야 하고,연산 결과는 D에 대입한다.
//
