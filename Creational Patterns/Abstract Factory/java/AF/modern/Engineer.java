package AF.modern;

import AF.abstractEntities.Defender;

public class Engineer implements Defender {
    @Override
    public void defend() {
        System.out.println("Build wall!!!");
    }
}
