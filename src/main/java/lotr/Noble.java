package lotr;

import java.util.Random;

public abstract class Noble extends Character{

    public Noble(int min, int max) {
        super(new Random().nextInt(max - min + 1) + min, new Random().nextInt(max - min + 1) + min);
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower()));
    }
}
