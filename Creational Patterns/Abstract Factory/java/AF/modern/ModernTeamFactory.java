package AF.modern;

import AF.abstractEntities.DamageDealer;
import AF.abstractEntities.Defender;
import AF.abstractEntities.Healer;
import AF.abstractEntities.TeamFactory;

public class ModernTeamFactory implements TeamFactory {
    @Override
    public DamageDealer getDamageDealer() {
        return new Soldier();
    }

    @Override
    public Defender getDefender() {
        return new Engineer();
    }

    @Override
    public Healer getHealer() {
        return new Medic();
    }
}
