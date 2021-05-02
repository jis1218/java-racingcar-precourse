package kr.insup.view;

import kr.insup.domain.Car;
import kr.insup.domain.Cars;

import java.util.List;
import java.util.Scanner;

public class GameView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,)로 구분)");
        return scanner.nextLine();
    }

    public static Integer getTrial() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String trial = scanner.nextLine();
        return Integer.valueOf(trial);
    }

    public static void showRaceResult(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getName());
            System.out.print(":");
            showPosition(car);
            System.out.println();
        }
        System.out.println();
    }

    private static void showPosition(Car car) {
        for (int i = 0; i < car.checkPosition(); i++) {
            System.out.print("-");
        }
    }

    public static void showWinner(List<String> winnerList) {
        for (String winner : winnerList) {
            System.out.print(winner);
            System.out.print(",");
        }
        System.out.println("가 최종 우승 했습니다");
    }

    public static void wrongCarName() {
        System.out.println("입력한 차 이름이 잘못되었습니다. 다시 입력하세요.");
    }

    public static void wrongInputNumber() {
        System.out.println("숫자 형식이 잘못됐습니다. 다시 입력하세요.");
    }

}
