package lv.linda.rocketscience;

/**
 * Class for building spaceships
 */
public class Rocket {
    private String name;
    private String colour;
    private int weight;
    private static int rocketCounter;
    private int height;
    private Engine engine;
    public String id;



    static int countRockets() {
        return rocketCounter;
    }

    static void addRocket() {
        rocketCounter++;
    }

    /**
     * non-argument constructor
     */
    public Rocket() {
        addRocket();
    }

    /**
     *
     * @param name
     * @param colour
     * @param weight
     * @param height
     * @param engine
     */
    public Rocket(String name, String colour, int weight, int height, Engine engine) {
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.height = height;
        this.engine = engine;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
