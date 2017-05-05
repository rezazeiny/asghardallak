import java.util.ArrayList;

public class Earth {

    private int length;
    private int width;
    private Cell[][] map;
    private ArrayList<Player> player;
    private ArrayList<Farm> farm;
    private ArrayList<Jungle> jungle;
    private ArrayList<Cave> cave;
    private ArrayList<Village> village;
    private Logger logger;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Cell[][] getMap() {
        return map;
    }

    public void setMap(Cell[][] map) {
        this.map = map;
    }

    public ArrayList<Player> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Player> player) {
        this.player = player;
    }

    public ArrayList<Farm> getFarm() {
        return farm;
    }

    public void setFarm(ArrayList<Farm> farm) {
        this.farm = farm;
    }

    public ArrayList<Jungle> getJungle() {
        return jungle;
    }

    public void setJungle(ArrayList<Jungle> jungle) {
        this.jungle = jungle;
    }

    public ArrayList<Cave> getCave() {
        return cave;
    }

    public void setCave(ArrayList<Cave> cave) {
        this.cave = cave;
    }

    public ArrayList<Village> getVillage() {
        return village;
    }

    public void setVillage(ArrayList<Village> village) {
        this.village = village;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Earth(int length, int width) {
        this.length = length;
        this.width = width;
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                Coordination coordination = new Coordination(i, j);
                map[i][j] = new Cell("Earth" , coordination);
            }
        }
    }

    public Earth() {
        this(300, 300);
    }

}