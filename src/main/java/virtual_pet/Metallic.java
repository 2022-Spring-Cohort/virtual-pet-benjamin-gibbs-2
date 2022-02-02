package virtual_pet;

public abstract class Metallic extends Animal {
    protected static int oilLevel;
    protected static int repairLevel;
    protected String classification;

    public Metallic(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.oilLevel = 5;
        this.repairLevel = 5;
        this.classification = "Metallic";
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getRepairLevel() {
        return repairLevel;
    }

    public String getClassification() {
        return classification;
    }
}
