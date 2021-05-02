package kr.insup.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerPickerTest {

    private static final int TRIAL = 3;

    Cars cars;
    WinnerPicker winnerPicker;

    @DisplayName("차 생성")
    @BeforeEach
    void 차_생성() {
        cars = new Cars("a, b, c, d");
        winnerPicker = new WinnerPicker(cars);
    }

    @DisplayName("우승 차량 확인")
    @Test
    void 우승_차량_확인() {
        //given
        int[][] numbers =
                {
                        {3, 4, 7, 5},
                        {4, 2, 6, 6},
                        {2, 5, 8, 7}
                };

        //when
        for (int i = 0; i < TRIAL; i++) {
            cars.moveCars(numbers[i]);
        }
        List<String> strWinners = winnerPicker.announceWinner();
        List<String> answers = Arrays.asList("c", "d");

        //then
        assertThat(strWinners).containsExactlyElementsOf(answers);
    }
}
