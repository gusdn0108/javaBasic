### javaBasic

1. js console.log()랑 비슷한것

- System.out.println();

2. psvm , main 으로 단축키 쓸수있음

- 글자,숫자(정수포함 다 적을수있음)
- 간단한 연산 가능

## 변수

1. main 함수안에

- 형태 , 변수명 = 변수상태값

2. 자료형

- String : 문자열
- int : 정수
  범위가 정해져있음 (-21억 ~ +21억까지)
- double : 실수
- char : 문자열(단어 or 짧은형식)
- boolean : 참,거짓을 판별해주는 논리연산형태
- float : double 처럼 새심한 자료형이 아님 선언하고싶으면 실수값 뒤에 F를 붙혀주기
  "정밀한 계산할땐 쓰지않기"
- long : int형식보다 큰 데이터값을 연산하고싶을때
  뒤에 소문자 l or 대문자 L선언
  숫자가 클때 \_로 구분해줄수있음.

3. 변수명 국룰
   1-1: 최대한 직관적일것
   1-2: 쓸데없는 데이터 입력 방지 할 수 있게 도와줄수있음
   1-3: 가독성 좋게 짜야함

4. final

바뀔일이 없는 상수선언
절대적 상수인데 아래에서 변수로 이용해 값을 바꾸면

"\_generated_diagnostic_collection_name"

터미널에 이런식으로 오류가 발생하게됨

5. 형 변환

변수 앞에 (변환할 형태)
ex) (float)score

6. 변환 메서드
   숫자 -> 문자열

String.valueOf : 정수
Double.toString : 실수

    문자열 -> 숫자

Integer.parseInt : 정수
Double.parseDouble : 실수

자바스크립트에서 많이 썻던 방법이였으나 잘 까먹었음 잘 숙지 해놔야할듯

형 변환할때 변환 할 형태 상태값을 잘 정리해줘야함 안그럼 오류가뜸
