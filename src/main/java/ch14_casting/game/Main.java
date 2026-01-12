package ch14_casting.game;

import ch14_casting.game.items.*;
import ch14_casting.game.system.Inventory;

public class Main {
    public static void main(String[] args) {
        // AllArgsConstructor를 활용한 Inventory 객체 생성
        Inventory inventory1 = new Inventory(new Weapon[5]);
        // 추가로 생성한 생성자를 활용한 Inventory 객체 생성
        Inventory myInventory = new Inventory(5);

        myInventory.addWeapon(new Sword());
        myInventory.addWeapon(new Bow());
        myInventory.addWeapon(new Staff());

        myInventory.attackAll();
        System.out.println();
        myInventory.useSpecialAbilities();

    }
}
