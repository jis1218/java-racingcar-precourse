package kr.insup.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {

    @DisplayName("차 이름 입력 검증")
    @ParameterizedTest
    @CsvSource({"a", "as", "car", "dice", "mouse", "가", "가나다", "람보르기니"})
    void 차_이름_입력_검증(String carsNameInput) {
        assertThat(new Name(carsNameInput)).isInstanceOf(Name.class);
    }

    @DisplayName("차 이름 입력 실패")
    @ParameterizedTest
    @CsvSource({"ronaldo", "computer", "ohmygod", "pillow"})
    void 차_이름_입력_실패(String carsNameInput) {
        //when, then
        assertThatThrownBy(() -> new Name(carsNameInput)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("차 이름 입력 실패(공백)")
    @Test
    void 차_이름_입력_실패_공백문자() {
        //when, then
        assertThatThrownBy(() -> new Name("")).isInstanceOf(IllegalArgumentException.class);
    }
}
