### 배열

의미 : 같은 자료형의 값 여러개를 저장하는 연속된 공간

1. 배열 선언

1-1.
String[] 변수명 = new String[갯수];
1-2.
String 변수명[]= new String[갯수]

- []의 위치는 변수명앞에있든 자료구조형태앞에있든 상관없다.
-

1-3.
String coffees[]= new String[4]
coffees[0] = "아메리카노"; // 0 부터 시작
coffees[1] = "카페모카";
coffees[2] = "라떼";
coffees[3] = "카푸치노";

1-4.
String[] coffees = new String[] {"아메리카노","카페모카","라떼","카푸치노"};

1-5.
String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};

- 도중에 coffees[인덱스값] = "바꿀내용"
  으로 선언하게 되면 인덱스 값을 출력할때 바꿀내용으로 내보내게된다.

- 번외) 다른 자료형

  int[] i = new int[3];
  i[0]=1;
  i[1]=2;
  i[2]=3;

        double[] d = new double[] {10.0,11.2,13.5};
        boolean[] b = {true,true, false};

2. 배열의 순회

for문을 이용하여 배열에 있는 값들을 출력할수있음

length : 배열이 길이를 통해 순환시킬수있음
사용방법 - 배열값.length

enhanced for (for-each) 반복문 :
사용방법 -
for(자료구조형 변수명 : 배열값){

}

- for문 배열 순회와 foreach의 차이는
  for문은 중간에 break를 걸 수 있지만 foreach는 따로
  break기능이 없어 전부 명령을 수행 할 수 밖에없다
  예시로 선착순으로 커피 사줄게~ 하는 조건이 있다면 일반적인
  for문을 써야하고 상관없이 모두 사주고싶다 ~ 이럴땐 foreach를 써도 된다 내가 어떤 구조의 코드를 짜야하는지 잘 파악하고 쓰도록하자.

3. 다차원 배열

일반적으로 배열안에 값뿐만이 아니라
다차원 적 으로 값을 정의헤야할때

자료구조형태[][] 변수 = new 자료구조형태[][]{
{배열값}
}

이런 형태로 만들어 선언하게되면
배열안에 배열값들을 만들어 줄 수 있다.

1-1 3차원 배열 만들기 :
자료구조형태[][][] 변수명 = new 자료구조형태[][][]{
{{},{},{}},
{{},{},{}},
{{},{},{}}
};

or

자료구조형태 [][][] 변수명 = new 자료구조형태[갯수][갯수][갯수];

아마 후자 형태를 많이 쓰지않을까..

4. 다차원 배열 순회

회고록 : 수식짜는게 너무 어려움 알고리즘 문제 풀기훈련을 좀 많이 해야할듯.. 뭔가 어렴풋이 떠오르는데 그걸 코드로 잘 표현을 못하겠음 실무때도 이런거 때문에 시간 많이 잡아먹었는데 수학을 해야하나 싶음...
