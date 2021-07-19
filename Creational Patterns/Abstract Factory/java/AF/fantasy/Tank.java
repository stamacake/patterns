package AF.fantasy;

import AF.abstractEntities.Defender;

public class Tank implements Defender {
    @Override
    public void defend() {
        System.out.println("Shield Block***");
    }
}
