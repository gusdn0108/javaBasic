### 문자열

1. String 형태의 내장함수들
   1-1. length : 문자의 길이
   1-2. toUpperCase : 대문자로 변환
   1-3. toLowerCase : 소문자로 변환
   1-4. contains : 글자가 포함되 있다면 true 포함되지않으면false 값이 boolean으로 리턴해줌
   1-6. indexOf : 글자가 몇번째에 있는지 리턴해주는 내장함수
   글자가 포함되있지않으면 -1를 반환
   1-7. lastIndexOf : 단어의 마지막 위치 정보 이 내장함수도 포함되어있지않으면 -1를 리턴해줌
   1-8. startsWith : 이 문장의 첫시작이 주어진 단어가 맞는가?
   boolean 형태로 리턴

2. 문자열 변환

   replace : "바꾸고 싶은 값 " , "바꿀 값"
   substirng : 인덱스 기준 시작 (0),인덱스 기준 끝(lastNum) 이전 내용은 삭제
   indexOf 내장함수를 이용하여 응용할수있음 indexOf()안에 내가 지우고싶은 이전 문장 or 단어

#### substirng Ex)

s.substring(s.indexOf("gonna")
결과값 : gonna bring a new

s.substirng(s.indexOf("ma"),s.indexOf("new))
결과값 : ma Santa's gonna bring a

    trim : 앞뒤 공백 제거

### 문자열 합치기

## 선언값 + 선언값 = 그대로 공백없이 문자열 출력

3. 문자열 비교
   concat = 선언값.concat("원하는문자열").concat(선언값)
   하면 원하는 특정구문으로 바꿀수있다.

equlas = 특정 문구열 비교.
소,대문자까지 구별해줌.

equlasIgnoreCase = 소,대문자 구분 X

### 문자열 비교 심화

String s1 = "1234";
String s2 = "1234";

와 같이 하게 되면 메모리 공간에 "1234" 가 하나만 생성되며 s1, s2 변수는 동일한 위치를 참조하게 된다. 그리고 == 연산자를 사용하여 둘을 비교하게 되면 이들이 참조하고 있는 메모리 주소값을 기준으로 판단하며 예제의 경우 같은 곳을 참조하기 때문에 true 가 된다.

String s1 = new String("1234");
String s2 = new String("1234");

와 같이 하게 되면 메모리 공간에 서로 다른 "1234" 가 각각 생성되며 s1, s2 변수는 서로 다른 위치를 참조하게 된다.
그래서 == 연산을 통한 비교 결과는 false 가 된다
