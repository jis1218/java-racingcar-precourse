package kr.insup.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    private static final int TRIAL = 3;
    Cars cars;

    @DisplayName("차 생성")
    @BeforeEach
    void makeCar() {
        cars = new Cars("a, b, c, d");
    }

    @DisplayName("차 컬렉션 생성")
    @Test
    void 입력값_받아_차_컬렉션_생성() {
        //then
        assertThat(cars.size()).isEqualTo(4);
    }

    @DisplayName("차가 잘 움직이는지 확인")
    @Test
    void 차가_잘_움직이는지_확인() {
        //given
        int[][] numbers =
                {
                        {3, 4, 7, 1},
                        {4, 2, 6, 3},
                        {2, 5, 8, 2}
                };
        int[] answer = {1, 2, 3, 0};

        //when
        for (int i = 0; i < TRIAL; i++) {
            cars.moveCars(numbers[i]);
        }
        int[] positions = cars.getCarsPosition();

        //then
        assertThat(positions).containsExactly(answer);
    }
}