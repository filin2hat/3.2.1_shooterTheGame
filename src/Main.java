import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        while (true) {
            System.out.format("\nУ игрока %d слотов с оружием,"
                            + " введите номер, чтобы выстрелить,"
                            + " -1 чтобы выйти.%n",
                    player.getSlotsCount()
            );
            player.printWeaponSlots();
            int slot = scanner.nextInt();

            if (slot == -1) {
                System.out.println("Game over!");
                break;
            }
            player.shotWithWeapon(slot);
        }
    }
}
