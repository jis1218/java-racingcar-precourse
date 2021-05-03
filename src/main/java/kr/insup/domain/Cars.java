package kr.insup.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars = new ArrayList<>();
    private int size;

    public Cars(String input) {
        String[] carNames = input.split(",");
        for (String carName : carNames) {
            carName = carName.trim();
            cars.add(new Car(carName));
        }
        size = cars.size();
    }

    public int size() {
        return this.size;
    }

    /**
     * 모든 차를 움직이게 하는 메서드
     *
     * @param oneSet 랜덤으로 생성된 값들의 세트, 배열의 크기는 경주차 수와 같다.
     */
    public void moveCars(int[] oneSet) {
        for (int i = 0; i < this.size; i++) {
            getCar(i).moveCar(oneSet[i]);
        }
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

    public List<Car> getCars() {
        return cars;
    }

    /**
     * 테스트용 메서드, 모든 경주차의 현재 위치를 배열로 반환한다.
     *
     * @return 현재 모든 경주차의 위치값의 배열
     */
    public int[] getCarsPosition() {
        int[] positions = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            positions[i] = getCar(i).checkPosition();
        }
        return positions;
    }
}
