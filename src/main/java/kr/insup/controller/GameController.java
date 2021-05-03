package kr.insup.controller;

import kr.insup.domain.Cars;
import kr.insup.domain.NumberSetGenerator;
import kr.insup.domain.Trial;
import kr.insup.domain.WinnerPicker;
import kr.insup.view.GameView;

import java.util.List;

public class GameController {

    public void runGame() {
        Cars cars = getCars();
        Integer trial = getTrial();
        runRace(cars, trial);
        checkWinner(cars);
    }

    private String getCarsName() {
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

    private Cars getCars() {
        Cars cars;
        do {
            String carsName = getCarsName();
            cars = getCarsInstance(carsName);
        } while (cars == null);
        return cars;
    }

    private Integer getTrial() {
        Trial trial;
        do {
            trial = getTrialView();
        } while (trial == null);
        return trial.getTrial();
    }

    private Trial getTrialView() {
        String trialInput = GameView.getTrial();
        Trial trial = null;
        try {
            trial = new Trial(trialInput);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            GameView.wrongInputNumber();
        }
        return trial;
    }

    private void runRace(Cars cars, int trial) {
        for (int i = 0; i < trial; i++) {
            NumberSetGenerator numberSetGenerator = new NumberSetGenerator(cars.size());
            cars.moveCars(numberSetGenerator.makeOneSet());
            GameView.showRaceResult(cars);
        }
    }

    private void checkWinner(Cars cars) {
        WinnerPicker winnerPicker = new WinnerPicker(cars);
        List<String> winnerList = winnerPicker.announceWinner();
        GameView.showWinner(winnerList);
    }
}
