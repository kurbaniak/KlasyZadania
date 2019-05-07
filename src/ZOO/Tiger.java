package ZOO;

public class Tiger extends Animal {

    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    @Override
    public void introduce() {
        System.out.println("I'm tiger. My name is " + this.name
                + ". I weight " + this.weight
                + " kg and my claw length is " + clawLength + ".");
    }

    public int getClawLength() {
        return clawLength;
    }

    public void setClawLength(int clawLength) {
        this.clawLength = clawLength;
    }
}
