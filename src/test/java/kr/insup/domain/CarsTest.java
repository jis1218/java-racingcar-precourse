package kr.insup.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @DisplayName("차 컬렉션 생성")
    @Test
    void 입력값_받아_차_컬렉션_생성() {
        //given
        //when
        Cars cars = new Cars("a, b, c, d");

        //then
        assertThat(cars.size()).isEqualTo(4);
    }
}
