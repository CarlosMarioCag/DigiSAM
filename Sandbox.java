import java.util.ArrayList;
import java.util.List;

public class Sandbox {
    private String name;
    private String terrain;
    private List<Digimon> inhabitants;
    private int turn;

    public Sandbox(String name, String terrain) {
        this.name = name;
        this.terrain = terrain;
        this.inhabitants = new ArrayList<>();
        this.turn = 1;
    }

    public void addDigimon(Digimon digimon) {
        inhabitants.add(digimon);
    }

    public void moveDigimon(Digimon digimon, int dx, int dy) {
        digimon.move(dx, dy);
        System.out.println(digimon.getName() + " moved to " + digimon.getPosition());
        handleTurnEvent(digimon);
    }

    public void nextTurn() {
        turn++;
        System.out.println("Turn " + turn + " started.");
    }

    public void handleTurnEvent(Digimon digimon) {
        System.out.println("Event: " + digimon.getName() + " acted during turn " + turn);
    }

    public List<Digimon> getInhabitants() {
        return inhabitants;
    }

    public String getName() {
        return name;
    }

    public String getTerrain() {
        return terrain;
    }

    public int getTurn() {
        return turn;
    }
}
