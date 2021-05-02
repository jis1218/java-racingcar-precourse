package kr.insup.controller;

import kr.insup.domain.Cars;
import kr.insup.domain.NumberSetGenerator;
import kr.insup.domain.WinnerPicker;
import kr.insup.view.GameView;

import java.util.List;

public class GameController {

    public void runGame() {
        String carsName;
        Cars cars;
        Integer trial;
        do {
            carsName = getCarsName();
            cars = getCarsInstance(carsName);
        } while (cars == null);

        do {
            trial = getTrial();
        } while (trial == null);

        for (int i = 0; i < trial; i++) {
            NumberSetGenerator numberSetGenerator = new NumberSetGenerator(cars.size());
            cars.moveCars(numberSetGenerator.makeOneSet());
            //뷰로 과정 뿌려줘야 함
            GameView.showRaceResult(cars);
        }

        //승자 확인인
        WinnerPicker winnerPicker = new WinnerPicker(cars);
        List<String> winnerList = winnerPicker.announceWinner();
        GameView.showWinner(winnerList);
    }

    private String getCarsName() {
        //사용자 입력 받아 자동차 생성
        return GameView.getCarsName();
    }

    private Cars getCarsInstance(String carsName) {
        Cars cars = null;
        try {
            cars = new Cars(carsName);
        } catch (IllegalArgumentException e) {
            GameView.wrongCarName();
        }
        return cars;
    }

    private Integer getTrial() {
        //사용자 입력 받아 시도횟수 설정
        Integer trial = null;
        try {
            trial = GameView.getTrial();
        } catch (Exception e) {
            GameView.wrongInputNumber();
        }
        return trial;
    }
}
