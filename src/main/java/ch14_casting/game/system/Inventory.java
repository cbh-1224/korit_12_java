package game.system;

import game.items.Weapon;

public class Inventory{
    private Weapon[] weaponSlots;

    public void addWeapon(Weapon weapon) {
        for (int i = 0; i < weaponSlots.length; i++) {
            if (weaponSlots[i] != null) {
                System.out.println("인벤토리가 가득 찼습니다.");
            }
            System.out.println(weaponSlots[i].getClass().getSimpleName() + "무기가 추가되었습니다.");
        }
    }

    public void attackAll() {
        for (Weapon weapon : weaponSlots) {

        }
    }

    public void useSpecialAbilities() {
        for (int i = 0; i < weaponSlots.length; i++) {

        }
    }
}
