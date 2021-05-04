package kr.insup.domain;

public class Car {

    private static final int MOVE_CRITERIA = 4;

    private Name name;
    private Position position;

    public Car(String strName) {
        name = new Name(strName);
        position = new Position();
    }

    /**
     * 현재 경주차가 어느 위치에 있는지 확인
     *
     * @return 경주차의 위치값
     */
    public int checkPosition() {
        return position.getPosition();
    }

    /**
     * 차를 움직이게 하는 메서드
     *
     * @param givenNumber 랜덤값 중 하나, 4 이상이면 경주차가 움직이고 미만이면 움직이지 않음
     */
    public void moveCar(int givenNumber) {
        if (givenNumber >= MOVE_CRITERIA) {
            position.movePosition();
        }
    }

    public String getName() {
        return name.getName();
    }
}