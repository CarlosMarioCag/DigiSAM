import java.util.Random;

public class Battle {
    private final Random random = new Random();

    public Digimon simulateFight(Digimon attacker, Digimon defender) {
        int attackerLife = attacker.getLifePoints();
        int defenderLife = defender.getLifePoints();

        while (attackerLife > 0 && defenderLife > 0) {
            defenderLife -= calculateDamage(attacker.getAttack(), defender.getDefense());
            if (defenderLife <= 0) {
                return attacker;
            }

            attackerLife -= calculateDamage(defender.getAttack(), attacker.getDefense());
            if (attackerLife <= 0) {
                return defender;
            }
        }

        return attackerLife > 0 ? attacker : defender;
    }

    private int calculateDamage(double attack, double defense) {
        double factor = 0.7 + (random.nextDouble() * 0.6);
        double damage = Math.max(1, (attack - (defense / 2)) * factor);
        return (int) Math.round(damage);
    }
}
