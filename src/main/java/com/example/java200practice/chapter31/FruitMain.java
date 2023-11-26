package com.example.java200practice.chapter31;

public class FruitMain {
    public static void main(String[] args) {
        FRUIT pear = FRUIT.APPLE;
        FRUIT pear2 = FRUIT.MANGO;
        System.out.println(pear);
        System.out.println(pear.name());
        System.out.println(pear.ordinal());  //선언될 때 순서 0
        System.out.println(pear2.ordinal()); // 선언될 때 순서 2
        FRUIT[]fruits = FRUIT.values();
        System.out.println(fruits[0]);
    }
    /*  APPLE
        APPLE
        0
        2
        APPLE*/
    /*enum을 int로 변환하거나 대입할 수 없다.
    int a = FRUIT.APPLE;형식은 예외가 발생한다.
    꼭 변환해서 사용하고 싶다면 순서를 나타내는 ordinal()을 사용한다.
    메소드가 없는 기본 enum은 연산에 적합하지 않으며
    if, switch와 같은 분기문에 사용한다.*/
    //상수의 묶음 클래스인 enum
}
