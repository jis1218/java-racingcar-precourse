package kr.insup.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FuelNumberGeneratorTest {

    static final int CAR_NUMBER = 4;

    @DisplayName("숫자 모음을 잘 생성하는지 확인")
    @RepeatedTest(100)
    void 숫자_모음_생성_확인(){
        //when
        int[] numbers = FuelNumberGenerator.makeFuelNumbers(CAR_NUMBER);
        int[] answers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //then
        assertThat(answers).contains(numbers);
    }
}
