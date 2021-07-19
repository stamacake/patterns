package AF.modern;

import AF.abstractEntities.DamageDealer;

public class Soldier implements DamageDealer {
    @Override
    public void attack() {
        System.out.println("Rifle fire!!!");
    }
}
