package Lesson9.SimpleGame;

public interface Liveable {
    int HP = 100;
    void attack(Object o);
    default boolean isAlive()
    {
        if (this instanceof Player tmp)
        {
            return tmp.getCurrentHP() > 0;
        }
        else if(this instanceof Enemy tmp)
        {
            return tmp.getCurrentHP() > 0;
        }
        return false;
    }
}
