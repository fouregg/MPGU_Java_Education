package Lesson6.PlayerWeapons;

/**
 * ����������� ����� �� ��������� ��������� ������� ����� ������
 * ��� ���������� ���������, ����� ���������� ������� ����� �� �������� ����� ����������
 * ������ ��� ����� �������� ����� �� �����.
 * ������ �� ����� ������ ����������� ����� �� ����������� �������, ���� Math.
 */
public abstract class Weapon {
    /**
     * protected - ��� ����� ������� ���������, ������� ��������� ���������� � ���������� �������� ������ �����������
     * � ���� ������� ������ ������(package)
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
