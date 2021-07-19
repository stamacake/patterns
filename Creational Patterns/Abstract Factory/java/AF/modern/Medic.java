package AF.modern;

import AF.abstractEntities.Healer;

public class Medic implements Healer {
    @Override
    public void heal() {
        System.out.println("Apply first aid kit!!!");
    }
}
