package AF.fantasy;

import AF.abstractEntities.DamageDealer;
import AF.abstractEntities.Defender;
import AF.abstractEntities.Healer;
import AF.abstractEntities.TeamFactory;

public class FantasyTeamFactory implements TeamFactory {
    @Override
    public DamageDealer getDamageDealer() {
        return new FireMage();
    }

    @Override
    public Defender getDefender() {
        return new Tank();
    }

    @Override
    public Healer getHealer() {
        return new Cleric();
    }
}
