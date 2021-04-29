package kr.insup.utils;

import java.util.Random;

public class RandomValueGenerator {

    private static Random random = new Random();
    private static int MAX_BOUND = 10; //0~9 사이의 값을 위한 bound

    public static int generateRandomValue() {
        return random.nextInt(MAX_BOUND);
    }
}
