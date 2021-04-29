package kr.insup.utils;

import kr.insup.utils.RandomValueGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomValueGeneratorTest {

    @DisplayName("랜덤값이 요구사항에 맞게 생성되는지 확인")
    @RepeatedTest(300)
    void 랜덤값_확인() {
        //when
        int randomValue = RandomValueGenerator.generateRandomValue();
        //then
        assertThat(randomValue).isGreaterThanOrEqualTo(0).isLessThanOrEqualTo(9);
    }
}
