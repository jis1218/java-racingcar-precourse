package kr.insup;

import kr.insup.domain.Cars;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    void 입력값_받아_차_생성() {
        //given
        //when
        Cars cars = new Cars("a, b, c, d");

        //then
        assertThat(cars.size()).isEqualTo(4);
    }
}
