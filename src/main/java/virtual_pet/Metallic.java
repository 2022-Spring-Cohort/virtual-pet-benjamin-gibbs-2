package virtual_pet;

public abstract class Metallic extends Animal {
    protected int oilLevel;
    protected int maintenanceLevel;
    protected int chargeLevel;
    protected String classification;

    public Metallic(String name, int age, String pronouns) {
        super(name, age, pronouns);
        oilLevel = randomNum(5, 100);
        maintenanceLevel = randomNum(5, 100);
        classification = "Metallic";
        chargeLevel = randomNum(5, 100);
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public String getClassification() {
        return classification;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    @Override
    public void play() {
        oilLevel = Math.max(0,oilLevel-10);
        maintenanceLevel = Math.max(0, maintenanceLevel - 10);
        chargeLevel = Math.max(0, chargeLevel - 10);
        happinessLevel = Math.min(100, happinessLevel + 20);
        boredomLevel = Math.max(0, boredomLevel - 10);
    }

    public void oil() {
        oilLevel = Math.min(100, oilLevel+10);
        maintenanceLevel = Math.min(100, maintenanceLevel + 20);
    }

    public void maintenance() {
        maintenanceLevel = Math.min(100, maintenanceLevel + 20);
    }

    public void charge() {
        chargeLevel = Math.min(100, chargeLevel + 25);
    }


    public String allMaintenanceMessage() {
        return getName() + " has been Maintenanced" +
                "\nLevel is now: " + maintenanceLevel;
    }

    public void tick() {
        oilLevel = Math.max(0, oilLevel - 1);
        maintenanceLevel = Math.max(0, maintenanceLevel - 1);
        chargeLevel = Math.max(0, chargeLevel - 20);
        boredomLevel = Math.min(100, boredomLevel + 1);
    }
}


