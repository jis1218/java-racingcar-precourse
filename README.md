# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
* 0~9 사이의 랜덤값을 만드는 기능
* 자동차 한대 만들기
  1. Random 값에 따라 전진 또는 멈춤 기능
* 자동차 여러대를 동작시키는 기능
  1. 입력값에 따라 자동차 생성
* 누가 우승했는지 확인하는 기능
* 입력값 처리
  1. 자동차 입력값 유효성 검사(차 한대당 5글자 이하)
  2. 입력값에 따른 시도횟수 처리(음수, 문자, 너무 큰 숫자는 예외처리(1~99만 허용))
  
* 출력값 처리
  1. 시도횟수만큼 각 차가 전진한 거리 보여주기
  2. 게임 진행 문구
