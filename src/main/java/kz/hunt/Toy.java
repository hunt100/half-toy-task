package kz.hunt;

public class Toy {

    private String id;
    private String name;
    private int weight; // 0 - 100

    public Toy(String id, String name, int weight) {
        if (weight < 0 || weight > 100) {
            throw new IllegalArgumentException("Wrong input for weight. Can be in range of 0 to 100");
        }

        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
