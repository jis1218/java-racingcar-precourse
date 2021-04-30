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

    public void moveCars(int[] oneSet) {
        for (int i = 0; i < this.size; i++) {
            getCar(i).moveCar(oneSet[i]);
        }
    }

    public Car getCar(int i) {
        return cars.get(i);
    }

    public int[] getCarsPosition() {
        int[] positions = new int[this.size];
        for (int i = 0; i < this.size; i++) {
            positions[i] = getCar(i).checkPosition();
        }
        return positions;
    }
}
