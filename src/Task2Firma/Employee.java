package Task2Firma;

public class Employee {
    private static int counter =0;
    private float solary;
    private String position;
    private int id;

    public Employee(String position, float solary) {
        this.solary = solary;
        this.position = position;
        this.id = counter;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }


    public float getSolary() {
        return solary;
    }

    public void setSolary(float solary) {
        this.solary = solary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "(" + id +") (" +getPosition() + ") : " + getSolary();
    }
}
