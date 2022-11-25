package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> numList = new ArrayList<>();

    public void input() {
        List<Integer> num = new ArrayList<>();

        System.out.print("세자리 숫자를 입력해주세요: ");
        String str = Console.readLine();

        for (int i = 0; i < str.length(); i++) {
            num.add(str.charAt(i) - '0');
        }

        if (isValidation(num)) {
            this.numList = num;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public List<Integer> getNumList() {
        return this.numList;
    }

    private boolean isValidation(List<Integer> list) {
        if (list.size() != 3) {
            return false;
        }

        return true;
    }
}
