package Lesson6.PlayerWeapons;

/**
 * јбстрактный класс не позвол€ет создавать объекты этого класса
 * ≈го необходимо объ€вл€ть, когда существует базовый класс от которого будут наследники
 * ќднако сам класс объектов иметь не может.
 * ќднако не стоит путать абстрактный класс со статическим классом, типа Math.
 */
public abstract class Weapon {
    /**
     * protected - это така€ область видимости, котора€ позвол€ет обращатьс€ к переменной напр€мую только наследникам
     * и всем классам внутри пакета(package)
     */
    protected int dmg;
    protected float durability;

    Weapon()
    {
        dmg = 10;
        durability = 40f;
    }

    Weapon(int dmg, float durability)
    {
        this.dmg = dmg;
        this.durability = durability;
    }

    public int getDmg() {
        durability -= 2;
        return dmg;
    }

    public float getDurability() {
        return durability;
    }

    public void setDurability(float value) {
        if (value > 0)
            this.durability = value;
        else
            throw new IllegalArgumentException("Can't set durability less 0");
    }
}
