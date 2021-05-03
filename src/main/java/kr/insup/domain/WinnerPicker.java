package kr.insup.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WinnerPicker {

    private final Cars cars;

    public WinnerPicker(Cars cars) {
        this.cars = cars;
    }

    private List<Car> getWinners() {
        List<Car> winners = new ArrayList<>();
        int maxPosition = getMaxPosition();
        for (Car car : cars.getCars()) {
            addWinner(winners, car, maxPosition);
        }
        return winners;
    }

    private void addWinner(List<Car> winners, Car car, int maxPosition) {
        if (car.checkPosition() == maxPosition) {
            winners.add(car);
        }
    }

    private int getMaxPosition() {
        return Collections
                .max(cars.getCars(), Comparator.comparingInt(Car::checkPosition))
                .checkPosition();
    }

    /**
     * 승자 이름을 String값의 List로 반환한다.
     *
     * @return 승자 이름 String값 List
     */
    public List<String> announceWinner() {
        List<Car> winCars = getWinners();
        List<String> strWinCars = new ArrayList<>();
        for (Car car : winCars) {
            strWinCars.add(car.getName());
        }
        return strWinCars;
    }
}
