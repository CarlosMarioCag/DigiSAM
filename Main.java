import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> realDigimonNames = List.of(
                "Agumon",
                "Gabumon",
                "Patamon",
                "Gatomon",
                "Veemon",
                "Guilmon",
                "Wormmon",
                "Renamon",
                "Terriermon",
                "Lopmon"
        );

        Random random = new Random();
        List<Digimon> digimons = new ArrayList<>();

        for (String name : realDigimonNames) {
            Digimon digimon = new Digimon();
            digimon.setName(name);
            digimon.setLevel(3);
            digimon.setAttribute("Data");
            digimon.setType("Reptile");
            digimon.setAttack(50 + random.nextInt(51));
            digimon.setDefense(50 + random.nextInt(51));
            digimon.setLifePoints(500);
            digimon.setData(0);
            digimon.setPosition(new Position(0, 0));
            digimons.add(digimon);
        }

        System.out.println("Generated Digimon seeds:");
        for (Digimon digimon : digimons) {
            System.out.println(
                    digimon.getName() + " | Level: " + digimon.getLevel()
                            + " | Attack: " + digimon.getAttack()
                            + " | Defense: " + digimon.getDefense()
                            + " | Life Points: " + digimon.getLifePoints()
                            + " | Data: " + digimon.getData()
            );
        }

        Digimon first = digimons.get(random.nextInt(digimons.size()));
        Digimon second = digimons.get(random.nextInt(digimons.size()));

        while (second == first) {
            second = digimons.get(random.nextInt(digimons.size()));
        }

        System.out.println("\nRandom fight selected:");
        System.out.println(first.toString());
        System.out.println(second.toString());
        

        System.out.println(first.getName() + " vs " + second.getName());

        int firstLife = first.getLifePoints();
        int secondLife = second.getLifePoints();

        while (firstLife > 0 && secondLife > 0) {
            int damageToSecond = Math.max(1, (int) Math.round(first.getAttack() - (second.getDefense() / 2.0)));
            secondLife -= damageToSecond;

            if (secondLife <= 0) {
                System.out.println(first.getName() + " hits " + second.getName() + " for " + damageToSecond + " damage.");
                System.out.println(first.getName() + " wins the fight!");
                break;
            }

            int damageToFirst = Math.max(1, (int) Math.round(second.getAttack() - (first.getDefense() / 2.0)));
            firstLife -= damageToFirst;

            System.out.println(first.getName() + " hits " + second.getName() + " for " + damageToSecond + " damage.");
            System.out.println(second.getName() + " hits " + first.getName() + " for " + damageToFirst + " damage.");

            if (firstLife <= 0) {
                System.out.println(second.getName() + " wins the fight!");
                break;
            }
        }
    }
}