package lotr;

import lombok.Getter;

//Constructor by ourselves or add AllArgsConstructor
@Getter
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

    public void setPower(int power) {
        if (power <= 0) {
            this.power = 0;
        }
        else {
            this.power = power;
        }
        
    }

    public void setHp(int hp) {
        if (hp <= 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
        
    }


}
