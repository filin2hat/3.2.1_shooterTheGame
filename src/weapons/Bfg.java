package weapons;

public final class Bfg extends Weapon {
    private String shotSound = "'<БААА - БАХ!>'";

    public Bfg(String weaponName) {
        super(weaponName);
    }

    @Override
    public void shot() {
        System.out.println(this.getWeaponName() + " стреляет " + shotSound);
    }
}
