package task321;

import task321.weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new BigGun(),
                new WaterPistol(),
                new Slingshot(),
                new AutomaticRifle(),
                new RPG()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно
        if (slot > getSlotsCount()-1 || slot < 0) {
            throw new IllegalArgumentException();
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}