package weapons;

public final class Riffle extends Weapon {

    private String shotSound = "'ТЫЩ - ТЫЩ'";

    public Riffle(String weaponName) {
        super(weaponName);
    }

    @Override
    public void shot() {
        System.out.println(this.getWeaponName() + " стреляет " + shotSound);
    }
}
