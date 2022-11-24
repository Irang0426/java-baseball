package baseball;


import java.util.Scanner;

public class Player {
    private int num;

    public void setNum() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
