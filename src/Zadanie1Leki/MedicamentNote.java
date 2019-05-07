package Zadanie1Leki;

public class MedicamentNote {

    private String name;
    private int unit;
    private double costPerUnit;

    public MedicamentNote(String name, int unit, double costPerUnit) {
        this.name = name;
        this.unit = unit;
        this.costPerUnit = costPerUnit;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }
}
