package com.example.java200practice.chapter38;
// 상수 묶음 클래스 - enum
public enum PEI {
    // 생성자를 통해 enum 값으로 초기화
    // 더 이상 값을 변경할 수 없다.
    PHYSICAL(23), EMOTIONAL(28), INTELLECTUAL(33);
    private final int peiValue;
    PEI(int pie) { // enum 초기화할 수 있는 생성자.
        this.peiValue=pie;

    }
    public int getPei(){
        return peiValue;
    }
    enum Fruit{
        APPLE, BANANA, MANGGO;
    }
}
