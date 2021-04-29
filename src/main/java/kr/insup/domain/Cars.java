package kr.insup.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> cars = new ArrayList<>();

    public Cars(String input) {
        String[] carNames = input.split(",");
        for(String carName : carNames){
            carName = carName.trim();
            cars.add(new Car(carName));
        }
    }

    public int size(){
        return cars.size();
    }
}
