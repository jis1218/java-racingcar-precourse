package kr.insup.domain;

public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    private Position position = new Position();

    public int checkPosition() {
        return position.getPosition();
    }

    public void setPosition(int givenNumber) {
        if (givenNumber >= 4) {
            position.movePosition();
        }
    }
}