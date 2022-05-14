package weapons;

public final class Pistol extends Weapon {

    private String shotSound = "'ПИУ - ПИУ'";

    public Pistol(String weaponName) {
        super(weaponName);
    }

    @Override
    public void shot() {
        System.out.println(this.getWeaponName() + " стреляет " + shotSound);
    }
}
