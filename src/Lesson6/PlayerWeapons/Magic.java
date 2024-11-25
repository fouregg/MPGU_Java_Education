package Lesson6.PlayerWeapons;

public class Magic extends Weapon{
    /**
     * MagicWeapon - является наследником класса Weapon - это значит, что он расширяет поведения и свойства этого класса
     * extends - ключевое слово, которое определяет, какой класс будет расширен. То есть от какого класса будет
     * наследование.
     */
    private float coefficientIntelligenceDmg;

    public Magic(){
        /**
         * super() - метод, который вызывает конструктор класса "Родителя"(базового). То есть в этом случае это
         * конструктор Weapon();
         */
        super();
        coefficientIntelligenceDmg = 0.1f;
    }

    public Magic(int dmg, float durability, float coefficientIntelligenceDmg) {
        /**
         * super так-же может вызвать и параметризованный конструктор. super() позволяет сократить повторяющийся код,
         * чтобы не прописывать двойную логику, которую можно вызвать из базового класса
         */
        super(dmg, durability);
        this.coefficientIntelligenceDmg = coefficientIntelligenceDmg;
    }

    @Override
    public int getDmg()
    {
        /**
         * В этом методе происходит переопределение метода getDmg из базового класса Weapon. Мы захотели определить
         * новую логику для этого метода, поэтому подписали аннотацию @override, которая говорит, что мы переопределяем
         * существующий метод
         */
        durability -= coefficientIntelligenceDmg;
        return (int)Math.ceil(dmg * (1 + coefficientIntelligenceDmg));
    }
}
