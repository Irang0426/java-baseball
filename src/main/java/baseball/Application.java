package baseball;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        /*
        - 기능 목록

        Validation
        입력과 정답 유효성 검사 (1부터 9로 이루어진 서로 다른 숫자 3개)

        User
        숫자 3개 입력

        Computer
        정답인 숫자 3개 랜덤으로 설정

        Judgment
        숫자 비교 후 결과 값 반환
        정답일 경우 재시작/종료

        View
        재시작 여부 출력
        결과 출력

         */

        Computer computer = new Computer();
        System.out.println(computer.getRandom());

        Player player = new Player();
        player.setNum();
        System.out.println(player.getNum());

    }
}
