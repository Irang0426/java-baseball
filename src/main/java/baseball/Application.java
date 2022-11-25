package baseball;

public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println(computer.getRandom());

        Player player = new Player();

        try {
            player.input();
        } catch (Exception e) {
            System.out.println("유효하지 않는 입력 값입니다.");
        }

        System.out.println(player.getNumList());
    }
}
