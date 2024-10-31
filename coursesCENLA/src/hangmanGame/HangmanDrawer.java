package hangmanGame;

/**
 * Класс HangmanDrawer отвечает за отрисовку виселицы в зависимости от оставшихся попыток.
 */
public class HangmanDrawer {

    /**
     * Метод для отрисовки состояния виселицы на основе оставшихся попыток.
     *
     * @param attemtpsLeft количество оставшихся попыток (от 0 до 7)
     */
    public void draw(int attemtpsLeft) {
        switch (attemtpsLeft) {
            case 7:
                System.out.println("  _______");
                System.out.println("  |      |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("_________|_\n");
                break;
            case 6:
                System.out.println("  _______");
                System.out.println("  |      |");
                System.out.println("  |      |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("_________|_\n");
                break;
            case 5:
                System.out.println("  _______");
                System.out.println("  |      |");
                System.out.println("  |      |");
                System.out.println("  O      |");
                System.out.println("         |");
                System.out.println("         |");
                System.out.println("_________|_\n");
                break;
            case 4:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println("  |     |");
                System.out.println("        |");
                System.out.println("________|_\n");
                break;
            case 3:
                System.out.println("  _______");
                System.out.println("  |     |");
                System.out.println("  |     |");
                System.out.println("  O     |");
                System.out.println(" /|     |");
                System.out.println("        |");
                System.out.println("________|_\n");
                break;
            case 2:
                System.out.println("  _______");
                System.out.println("  |      |");
                System.out.println("  |      |");
                System.out.println("  O      |");
                System.out.println(" /|\\     |");
                System.out.println("         |");
                System.out.println("_________|_\n");
                break;
            case 1:
                System.out.println("  _______");
                System.out.println("  |      |");
                System.out.println("  |      |");
                System.out.println("  O      |");
                System.out.println(" /|\\     |");
                System.out.println(" /       |");
                System.out.println("_________|_\n");
                break;
            case 0:
                System.out.println("  _______");
                System.out.println("  |      |");
                System.out.println("  |      |");
                System.out.println("  O      |");
                System.out.println(" /|\\     |");
                System.out.println(" / \\     |");
                System.out.println("_________|_");
                System.out.println("Игра окончена!\n");
                break;
            default:
                System.out.println("Ошибочное количество жизней.\n");
                break;
        }
    }

}
