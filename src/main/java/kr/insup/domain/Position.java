package kr.insup.domain;

public class Position {
    private int position = 0;

    public int getPosition() {
        return position;
    }

    public void movePosition() {
        position = position + 1;
    }
}
