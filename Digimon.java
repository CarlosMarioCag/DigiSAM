public class Digimon {
    private String name;
    private int level;
    private String attribute;
    private String type;
    private double attack;
    private double defense;
    private int data;
    private int lifePoints;
    private Position position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(int dx, int dy) {
        if (position != null) {
            position.move(dx, dy);
        }
    }
    
    public String toString() {
        return "Digimon{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", attribute='" + attribute + '\'' +
                ", type='" + type + '\'' +
                ", attack=" + attack +
                ", defense=" + defense +
                ", data=" + data +
                ", lifePoints=" + lifePoints +
                ", position=" + position +
                '}';
    }

    public String getStatsSummary() {
        return String.format(
                "Name: %-10s | Level: %-2d | Attribute: %-8s | Type: %-10s | Attack: %-3.0f | Defense: %-3.0f | Life Points: %-4d | Data: %-2d | Position: %s",
                name,
                level,
                attribute,
                type,
                attack,
                defense,
                lifePoints,
                data,
                position
        );
    }
}
