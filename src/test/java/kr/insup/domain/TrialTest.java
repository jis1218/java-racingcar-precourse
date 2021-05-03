package kr.insup.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TrialTest {

    @DisplayName("시도 횟수 입력 검증")
    @ParameterizedTest
    @CsvSource({"1", "24", "99"})
    void 시도_횟수_입력_검증(String trialInput) {
        //when, then
        assertThat(new Trial(trialInput)).isInstanceOf(Trial.class);
    }

    @DisplayName("시도 횟수에 잘못된 입력시 에러")
    @ParameterizedTest
    @CsvSource({"3f", "-10", "123432454354", "1233", "0"})
    void 시도_횟수에_잘못된_입력(String trialInput) {
        //when, then
        assertThatThrownBy(() -> new Trial(trialInput)).isInstanceOf(IllegalArgumentException.class);
    }
}
