package lab2;

public class Start {

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.startGame(args);
    }
}

class GuessingGame {

    public void startGame(String[] args) {
        int randomNum;
        int guess;

        if (args[0].length() == 0 || args[0].equals("help")){
            System.out.println("Введите число от 1 до 5");
            System.out.println("Для подробной информации введите: help");
            return;
        }

        randomNum = (int) (Math.random() * 5 + 1);
        guess = Integer.parseInt(args[0]);

        if (guess < 1 || guess >5) System.out.println("Неверно введено число, попробуйте еще раз");
        else if (guess == randomNum) System.out.println("Вы угадали");
        else System.out.println("Вы не угадали");
    }
}

