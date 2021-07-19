package AF.fantasy;

import AF.abstractEntities.Healer;

public class Cleric implements Healer {
    @Override
    public void heal() {
        System.out.println("Holy light***");
    }
}
