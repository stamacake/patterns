package AF;

import AF.abstractEntities.*;
import AF.modern.ModernTeamFactory;

public class CoD {
    public static void main(String[] args) {
        TeamFactory teamFactory = new ModernTeamFactory();
        DamageDealer damageDealer = teamFactory.getDamageDealer();
        Healer healer = teamFactory.getHealer();
        Defender defender = teamFactory.getDefender();

        damageDealer.attack();
        healer.heal();
        defender.defend();
    }
}
