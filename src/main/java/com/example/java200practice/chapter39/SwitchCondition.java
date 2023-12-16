package com.example.java200practice.chapter39;

//switch~case로 카드값 구하기
public class SwitchCondition {
    public static int toNum(char c){
        int tot = 0;
        switch(c) {
            case 'A':
                tot= 1;
                break;
            case 'T':
                tot = 10;
                break;
            case 'J':
                tot = 11;
                break;
            case 'Q' :
                tot = 12;
                break;
            case 'K':
                tot =13;
                break;
            default:tot=c-'0'; // '9' - '0'
            break;
        }
        return tot;

    }

    public static void main(String[] args) {
        char c= 'J';
        int result = toNum(c);
        System.out.printf("%c=> %d\n",c,result); //J=> 11
    }
}

/*키보드로 입력받은 0은 '0'이며, int로는 48이다.
'A'는 65, 'a'는 97이다.
'9'를  9로 변환하는 방법은 '9'-0으로, 57-48=9가 된다.*/


