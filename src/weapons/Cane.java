package weapons;

public final class Cane extends Weapon {
    private String shotSound = "'ТУЦ - ТУЦ'";

    public Cane(String weaponName) {
        super(weaponName);
    }

    @Override
    public void shot() {
        System.out.println(this.getWeaponName() + " стреляет " + shotSound);
    }
}
