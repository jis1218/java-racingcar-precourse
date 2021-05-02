package kr.insup.domain;

public class Car {

    private Name name;
    private Position position;

    public Car(String strName) {
        name = new Name(strName);
        position = new Position();
    }


    public int checkPosition() {
        return position.getPosition();
    }

    public void moveCar(int givenNumber) {
        if (givenNumber >= 4) {
            position.movePosition();
        }
    }

    public String getName() {
        return name.getName();
    }
}