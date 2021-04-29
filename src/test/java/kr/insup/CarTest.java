package kr.insup;

import kr.insup.domain.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
        car.setPosition(4);

        //then
        assertThat(car.checkPosition()).isEqualTo(position + 1);
    }

    @DisplayName("값이 3이하일 경우 그자리에")
    @Test
    void 자동차_그자리에() {
        //when
        int position = car.checkPosition();
        car.setPosition(3);

        //then
        assertThat(car.checkPosition()).isEqualTo(position);
    }
}
