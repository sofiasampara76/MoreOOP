package lotr;

import lombok.Getter;
import lombok.Setter;

//Constructor by ourselves or add AllArgsConstructor
@Getter @Setter
public abstract class Character {

    public Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    private int power;
    private int hp;

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }


}
