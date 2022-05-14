import weapons.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока" 
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new Cane("Монтировка Гордона Ф."),
                new Pistol("Пистолет Макарова"),
                new Akm47("Автомат Калашникова"),
                new Riffle("Снайперская винтовка Драгунова"),
                new Bfg("Финальная пушка Дум-гая")
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // проверяем введенный номер оружия
        if (slot <= 0 || slot > getSlotsCount()) {
            System.out.println("\n!!!Нет такого слота с оружием!!!\n");
        } else {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot-1];
            // Огонь!
            weapon.shot();
        }
    }

    public void printWeaponSlots() {
        System.out.println("\nДоступны следующие виды оружия для выстрела:");
        for (int i = 0; i < weaponSlots.length; i++) {
            System.out.println((i + 1) + " ." + weaponSlots[i]);
        }
    }
}