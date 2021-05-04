package kr.insup.utils;

import kr.insup.utils.RandomValueGenerator;

public class FuelNumberGenerator {

    /**
     * 차의 수만큼 랜덤값 배열을 생성한다.
     *
     * @param carNumber 차의 수
     * @return 차의 수만큼의 크기를 가진 랜덤값 배열
     */
    public static int[] makeFuelNumbers(int carNumber) {
        int[] numberSet = new int[carNumber];
        for (int i = 0; i < carNumber; i++) {
            numberSet[i] = RandomValueGenerator.generateRandomValue();
        }
        return numberSet;
    }
}
