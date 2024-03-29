Factrory Method Pattern
====

## 객체 생성 패턴의 한 종류
## 객체 생성 역할을 별도의 클래스에 넘기는 패턴
## 객체 생성의 책임을 구체적인 크래스가 아닌 추상 메서드에 넘긴다.
## 다양한 팩토리 클래스를 만들어 객체 생성 추상 메서드를 구현할 수 있다.

> 장점
>  > 확장에 열려있고, 변경에 닫혀있게 된다.
>    - 인터페이스를 이용해 느슨하게 결합시켰기 때문
>  > 생성에 쓰이는 공통 로직을 분류하여 공통화 할 수 있다.
>    - 중복된 코드가 줄어들게 될 것이다.
>    - 상속하는 모든 클래스가 동일한 공통 로직을 사용함을 보잘할 수 있다.
>  > 생성 객체가 변화할 여지가 있을 때, 변화에 대응하기 좋다.
>    - 인터페이스를 상속하는 클래스 하나를 더 만들어 구현만 해주면 된다.

> 단점
> >많은 클래스 파일과 인터페이스가 생겨난다.
> - 생성 객체가 변화할 여지가 없고 명활할 때는 크게 필요가 없다.