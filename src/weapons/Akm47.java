package weapons;

public final class Akm47 extends Weapon {
    private String shotSound = "'ТРА - ТА - ТА - ТА - ТААААА'";

    public Akm47(String weaponName) {
        super(weaponName);
    }

    @Override
    public void shot() {
        System.out.println(this.getWeaponName() + " стреляет " + shotSound);
    }
}
