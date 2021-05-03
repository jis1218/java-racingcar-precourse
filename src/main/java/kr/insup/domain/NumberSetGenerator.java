package kr.insup.domain;

import kr.insup.utils.RandomValueGenerator;

public class NumberSetGenerator {

    private final int carNumber;

    public NumberSetGenerator(int carNumber) {
        this.carNumber = carNumber;
    }

    /**
     * 차의 수만큼 랜덤값 배열을 생성한다.
     *
     * @return 차의 수만큼의 크기를 가진 랜덤값 배열
     */
    public int[] makeOneSet() {
        int[] numberSet = new int[carNumber];
        for (int i = 0; i < carNumber; i++) {
            numberSet[i] = RandomValueGenerator.generateRandomValue();
        }
        return numberSet;
    }


}
