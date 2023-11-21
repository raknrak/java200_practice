# java200_practice
<details>
<summary>참조타입 사용하기</summary>
 
- 참조 타입(Reference Type) : 객체(Object)타입 이라고도 한다.
    - 여러 개의 기본 타입을 저장하고 변환(가공), 이동(전송, transfer)할 수 있는 행위(메소드, method)를  갖는다. 예를 들어 Calender는 연, 월, 일을 저장하고 있으며 이를 이용해서 해당 연월일을 표현할 수 있는 long(정수) 또는 Date로 변환시킬 수 있다.
- 참조 타입의 종류 : 크게 이미 정의되어 있는 API(Object, Class, String, Math, StringBuffer, Date, Calendar, System…등)와 개발자(독자)가 만들어서 사용하는 타입으로 나눌 수 있다.
- 선언 방법 : 타입 레퍼런스 = new 객체();로 사용한다.
    - String은 new 없이 생성해서 사용하고, Calendar는 getInstance()로 사용한다.</details>
<details>
<summary>사용자 정의 참조 타입</summary>
 
-  사용자 정의 참조 타입 : 사용자가 선언한 클래스
- 선언 방법 : public class 클래스 이름 { }
- 기본적으로 한 클래스는 한 파일에 저장하며, 클래스와 파일의 이름이 동일해야 한다.
- 만약 한 파일에 클래스를 두 개 이상 선언할 때 파일 이름과 동일한 클래스에만 public을 붙일 수 있다.</details>
<details>
<summary>메소드 선언하고 호출하기</summary>
 
- 참조 타입(객체)은 중요한 데이터를 저장하거나 전송할 때 사용한다.
- 메소드는 이런 데이터를 가공하거나 변환하기 위해 사용한다.
- 또한 반복되거나 복잡한 부분도 메소드로 만들 수 있으며, 다음과 같은 형태로 사용한다.

```java
public 반환타입 메소드이름(아규먼트타입 아규먼트이름){ }
```

- 반환하지 않은 메소드는 리턴 타입이 void이다
    - 메소드 이름은 showHello, 반환하지 않는 void 메소드이다.
- 메소드는 반환 타입이 있는 메소드와 없는 메소드,
    - static메소드와 static이 아닌 메소드(멤버 메소드)로 분류할 수 있다.
    - 객체를 생성하지 않아도 static메소드를 호출할 수 있다.</details>
