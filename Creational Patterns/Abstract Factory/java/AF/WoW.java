package AF;

import AF.abstractEntities.*;
import AF.fantasy.FantasyTeamFactory;

public class WoW {
    public static void main(String[] args) {
        TeamFactory teamFactory = new FantasyTeamFactory();
        DamageDealer damageDealer = teamFactory.getDamageDealer();
        Healer healer = teamFactory.getHealer();
        Defender defender = teamFactory.getDefender();

        damageDealer.attack();
        healer.heal();
        defender.defend();
    }
}
