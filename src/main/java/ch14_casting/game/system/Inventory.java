package ch14_casting.game.system;

import ch14_casting.game.items.*; // * = 애스터리스크(asterisk / all의 의미)
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Inventory{
    private Weapon[] weaponSlots;

    public Inventory(int capacity) {
        this.weaponSlots = new Weapon[capacity];
    }

    public void addWeapon(Weapon weapon) {
        for (int i = 0; i < weaponSlots.length; i++) {
            if (weaponSlots[i] == null) {
                weaponSlots[i] = weapon;
                System.out.println("아이템이 슬롯 [ " + (i + 1) + " ] 에 추가되었습니다.");
                return;
            }
        }
        System.out.println("인벤토리가 가득찼습니다.");
    }

    public void attackAll() {
        System.out.println("업캐스팅을 응용한 각 객체의 고유 method 호출");
        for (Weapon weapon : weaponSlots) {
            if (weapon != null) {
                weapon.attack();
                continue;
            }
                System.out.println("무기를 장착하고 있지 않습니다.");
        }

    }

    public void useSpecialAbilities() {
        System.out.println("다운캐스팅을 응용한 각 객체의 고유 method 호출");
        for (Weapon weapon : weaponSlots) {
            if (weapon == null) {
                System.out.println("무기를 장착하고 있지 않습니다.");
                continue;
            }
            if (weapon instanceof Sword) {
                // 다운캐스팅
                Sword sword = (Sword) weapon;
                sword.parry();
            } else if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                bow.snipe();
            } else if (weapon instanceof Staff) {
                Staff staff = (Staff) weapon;
                staff.castSpell();
            } else {
                System.out.println("알 수 없는 무기입니다.");
            }
        }

    }
}
