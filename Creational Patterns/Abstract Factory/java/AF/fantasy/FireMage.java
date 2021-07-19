package AF.fantasy;

import AF.abstractEntities.DamageDealer;

public class FireMage implements DamageDealer {
    @Override
    public void attack() {
        System.out.println("Cast fireball***");
    }
}
