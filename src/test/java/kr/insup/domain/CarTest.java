package kr.insup.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    Car car;

    @BeforeEach
    void 자동차_생성() {
        car = new Car("name");
    }

    @DisplayName("값이 4이상일 경우 전진")
    @Test
    void 자동차_전진() {
        //when
        int position = car.checkPosition();
        car.moveCar(4);

        //then
        assertThat(car.checkPosition()).isEqualTo(position + 1);
    }

    @DisplayName("값이 3이하일 경우 그자리에")
    @Test
    void 자동차_그자리에() {
        //when
        int position = car.checkPosition();
        car.moveCar(3);

        //then
        assertThat(car.checkPosition()).isEqualTo(position);
    }

    @DisplayName("이름이 조건에 안맞을 경우 에러 발생")
    @Test
    void 자동차_이름_에러_처리() {
        //when
        //then
        assertThatThrownBy(() -> new Car("tesla3")).isInstanceOf(IllegalArgumentException.class);
    }
}
