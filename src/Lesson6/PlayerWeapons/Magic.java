package Lesson6.PlayerWeapons;

public class Magic extends Weapon{
    /**
     * MagicWeapon - �������� ����������� ������ Weapon - ��� ������, ��� �� ��������� ��������� � �������� ����� ������
     * extends - �������� �����, ������� ����������, ����� ����� ����� ��������. �� ���� �� ������ ������ �����
     * ������������.
     */
    private float coefficientIntelligenceDmg;

    public Magic(){
        /**
         * super() - �����, ������� �������� ����������� ������ "��������"(��������). �� ���� � ���� ������ ���
         * ����������� Weapon();
         */
        super();
        coefficientIntelligenceDmg = 0.1f;
    }

    public Magic(int dmg, float durability, float coefficientIntelligenceDmg) {
        /**
         * super ���-�� ����� ������� � ����������������� �����������. super() ��������� ��������� ������������� ���,
         * ����� �� ����������� ������� ������, ������� ����� ������� �� �������� ������
         */
        super(dmg, durability);
        this.coefficientIntelligenceDmg = coefficientIntelligenceDmg;
    }

    @Override
    public int getDmg()
    {
        /**
         * � ���� ������ ���������� ��������������� ������ getDmg �� �������� ������ Weapon. �� �������� ����������
         * ����� ������ ��� ����� ������, ������� ��������� ��������� @override, ������� �������, ��� �� ��������������
         * ������������ �����
         */
        durability -= coefficientIntelligenceDmg;
        return (int)Math.ceil(dmg * (1 + coefficientIntelligenceDmg));
    }
}
