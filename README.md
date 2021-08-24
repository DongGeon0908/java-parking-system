### SE 주차장

- 5층 짜리 주차장에는 소형차, 중형차, 대형차를 주차할 수 있습니다. 
- 층수는 1층부터 1,2,3,4,5 
- 소형차는 1, 중형차는 2, 대형차는 3의 크기를 가집니다. 
- 소형차 'S', 중형차 'M', 대형차 'L' 
- 소형차는 어느 주차공간에도 주차가 가능합니다. 
- 한층에 주차공간은 1크기의 주차공간이 5개, 2크기의 주차공간이 5개, 3크의 주차공간이 5개
- 각 주차공간의 위치는 순서대로 소형차부터 대형차 주차공간까지 순서대로 1 ~ 10의 번호를 갖습니다.
- 주차장에 차량이 주차되었을 경우 층-주차공간위치-차량사이즈-차량번호 >> 
- 사용자는 원하는 위치를 입력해서 들어옵니다.

1  2  3  4  5  6  7  8  8  10
소 소 소 소 소 중 중 중 대 대 대

### 요구사항
- 차량은 차량 넘버와 사이즈로 구성된다.
- 차량의 넘버가 중복되면 안된다.
- 층수는 1층부터 5층까지 존재한다.
- 차량은 소형, 중형, 대형 차량이 존재한다.
- 소형차는 어느 주차공간에도 주차가 가능하다
  - 대형차, 중형차는 본인의 사이즈에 맞추어 차량을 주차해야한다.
- 한층에 주차공간의 크기는 정해져있고, 위치는 사용자가 지정할 수 있다.
- 각 층에 각 크기에 맞추어 차량을 주창할 수 있다.
- 주차장 차량은 층-주차공간위치-차량사이즈-차량번호로 입력받는다

### 수정사항
- Enum을 너무 사용하지는 말자!
  - 확장성을 잃어버린다!
  - 추가되는 로직이 많아질 수록 하드코딩되는 부분이 많아진다...
- TDD를 습관화하자!
  - Test Case를 작성하는 습관을 들여야 한다!!
  - Controller가 없더라도 TestCase를 통해 코드를 확인할 수 있다.
- 확장성을 가지도록 클래스를 설계하자!
  - 현재 코드는 확장에 닫혀있다!
  - 확장이 원활하게 진행될 수 있는 코드로 수정하자!