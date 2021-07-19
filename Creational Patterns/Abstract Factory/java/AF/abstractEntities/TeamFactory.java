package AF.abstractEntities;

public interface TeamFactory {
    DamageDealer getDamageDealer();
    Defender getDefender();
    Healer getHealer();
}
