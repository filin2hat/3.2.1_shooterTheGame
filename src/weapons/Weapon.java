package weapons;

public class Weapon {
    private String weaponName;

    public Weapon(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void shot() {
        System.out.println(weaponName + " стреляет.\n");
    }

    public String toString() {
        return weaponName;
    }
}
