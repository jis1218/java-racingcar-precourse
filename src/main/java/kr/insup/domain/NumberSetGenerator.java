package kr.insup.domain;

import kr.insup.utils.RandomValueGenerator;

public class NumberSetGenerator {

    private final int carNumber;

    public NumberSetGenerator(int carNumber) {
        this.carNumber = carNumber;
    }

    public int[] makeOneSet(){
        int[] numberSet = new int[carNumber];
        for(int i = 0; i < carNumber; i++){
            numberSet[i] = RandomValueGenerator.generateRandomValue();
        }
        return numberSet;
    }


}
